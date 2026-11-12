package defpackage;

import com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class kbk implements c8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbk f23692a = new lbk(100);

    public static c8f b() {
        return new kbk();
    }

    public static boolean c(CharSequence charSequence, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            return true;
        }
        return z;
    }

    @Override // defpackage.c8f
    public boolean a(CharSequence charSequence, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc, boolean z) {
        String nationalNumberPattern = phonemetadata$PhoneNumberDesc.getNationalNumberPattern();
        if (nationalNumberPattern.length() == 0) {
            return false;
        }
        return c(charSequence, this.f23692a.a(nationalNumberPattern), z);
    }
}
