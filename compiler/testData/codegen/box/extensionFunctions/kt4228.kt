// IGNORE_BACKEND: JS_IR
class A {
    companion object
}

val foo: Any.() -> Unit = {}

fun test() {
    A.(foo)()
}

fun box(): String {
    test()
    return "OK"
}
