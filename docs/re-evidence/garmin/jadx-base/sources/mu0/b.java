package mu0;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmu0/b;", "Landroid/text/InputFilter;", "", "digitsBeforeZero", "digitsAfterZero", "", "separator", "<init>", "(IIC)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f121096a;

    public b(int i14, int i15, char c14) {
        StringBuilder sb3 = new StringBuilder("[0-9]{0,");
        sb3.append(i14 - 1);
        sb3.append("}+((\\");
        sb3.append(c14);
        sb3.append("[0-9]{0,");
        sb3.append(i15 - 1);
        sb3.append("})?)||(\\");
        sb3.append(c14);
        sb3.append(")?");
        Pattern patternCompile = Pattern.compile(sb3.toString());
        patternCompile.getClass();
        this.f121096a = patternCompile;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
        charSequence.getClass();
        spanned.getClass();
        if (this.f121096a.matcher(spanned).matches()) {
            return null;
        }
        return "";
    }
}
