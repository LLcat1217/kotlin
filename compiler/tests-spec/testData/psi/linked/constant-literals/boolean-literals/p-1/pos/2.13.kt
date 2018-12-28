/*
 * KOTLIN PSI SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACES: constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 13
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the simpleUserType.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

fun f1(a: `true`) {}

fun f2(a: `false`<*>) {}

fun f3(a: `true`<out *>) {}

fun f4(a: `false`<in List<`true`<*>>>) {}
