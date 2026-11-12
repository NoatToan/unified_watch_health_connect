package org.intellij.lang.annotations;

/* JADX INFO: loaded from: classes23.dex */
class a {

    @Language("RegExp")
    private static final String a = "(?:\\d+\\$)?";

    @Language("RegExp")
    private static final String b = "(?:[-#+ 0,(<]*)?";

    @Language("RegExp")
    private static final String c = "(?:\\d+)?";

    @Language("RegExp")
    private static final String d = "(?:\\.\\d+)?";

    @Language("RegExp")
    private static final String e = "(?:[tT])?(?:[a-zA-Z%])";

    @Language("RegExp")
    private static final String f = "[^%]|%%";

    @Language("RegExp")
    public static final String g = "(?:[^%]|%%|(?:%(?:\\d+\\$)?(?:[-#+ 0,(<]*)?(?:\\d+)?(?:\\.\\d+)?(?:[tT])?(?:[a-zA-Z%])))*";
}
