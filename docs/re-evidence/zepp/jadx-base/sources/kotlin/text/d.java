package kotlin.text;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class d {

    @NotNull
    public static final d a = new d();

    @JvmField
    @NotNull
    public static final Regex b;

    static {
        String strStringPlus = Intrinsics.stringPlus("[eE][+-]?", "(\\p{Digit}+)");
        b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + strStringPlus + ")?)|(\\.((\\p{Digit}+))(" + strStringPlus + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private d() {
    }
}
