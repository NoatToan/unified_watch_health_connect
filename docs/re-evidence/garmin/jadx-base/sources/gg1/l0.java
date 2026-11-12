package gg1;

import android.text.InputFilter;
import android.text.Spanned;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import zb0.c1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l0 implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77258a;

    public /* synthetic */ l0(int i14) {
        this.f77258a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x011d  */
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
        switch (this.f77258a) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.e.a aVar = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                charSequence.getClass();
                while (i14 < i15) {
                    wb0.b.a aVar2 = wb0.b.f183867c;
                    char cCharAt = charSequence.charAt(i14);
                    aVar2.getClass();
                    if (!new d53.k("^[A-Z0-9]+$").d(String.valueOf(cCharAt))) {
                        return "";
                    }
                    i14++;
                }
                return null;
            case 1:
                int i18 = PostCommentView.f47845f;
                if (i16 != 0) {
                    return charSequence;
                }
                String string = charSequence.toString();
                int length = string.length() - 1;
                int i19 = 0;
                boolean z14 = false;
                while (i19 <= length) {
                    boolean z15 = p005kotlin.jvm.internal.s.h(string.charAt(!z14 ? i19 : length), 32) <= 0;
                    if (z14) {
                        if (!z15) {
                            if (string.subSequence(i19, length + 1).toString().length() == 0) {
                                return "";
                            }
                            return charSequence;
                        }
                        length--;
                    } else if (z15) {
                        i19++;
                    } else {
                        z14 = true;
                    }
                }
                if (string.subSequence(i19, length + 1).toString().length() == 0) {
                    return "";
                }
                return charSequence;
            case 2:
                int i24 = GroupSettingsActivity.f31420z;
                while (i14 < i15) {
                    int type = Character.getType(charSequence.charAt(i14));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i14++;
                }
                return null;
            case 3:
                int i25 = GroupSettingsActivity.f31420z;
                while (i14 < i15) {
                    if (Character.isSpaceChar(charSequence.charAt(i14))) {
                        return "";
                    }
                    i14++;
                }
                return null;
            case 4:
                int i26 = GroupSettingsActivity.f31420z;
                while (i14 < i15) {
                    char cCharAt2 = charSequence.charAt(i14);
                    if (!Character.isLetter(cCharAt2) && !Character.isSpaceChar(cCharAt2) && cCharAt2 != ',' && cCharAt2 != '.' && cCharAt2 != '-') {
                        return "";
                    }
                    i14++;
                }
                return null;
            case 5:
                int i27 = GroupSettingsActivity.f31420z;
                while (i14 < i15) {
                    char cCharAt3 = charSequence.charAt(i14);
                    if (cCharAt3 == '@' && i16 == 0) {
                        return "@";
                    }
                    if (!Character.isLetterOrDigit(cCharAt3) && cCharAt3 != '_') {
                        return "";
                    }
                    i14++;
                }
                if (i16 != 0 || charSequence.length() <= 0 || charSequence.charAt(0) == '@') {
                    return null;
                }
                return "@" + ((Object) charSequence);
            case 6:
                return null;
            case 7:
                int i28 = tm0.c.f165349i;
                return (i16 == 0 && d53.w.i0(charSequence.toString()).toString().length() == 0) ? "" : charSequence;
            default:
                int i29 = c1.f203441z;
                charSequence.getClass();
                while (i14 < i15) {
                    wb0.b.a aVar3 = wb0.b.f183867c;
                    char cCharAt4 = charSequence.charAt(i14);
                    aVar3.getClass();
                    if (!new d53.k("^[A-Z0-9]+$").d(String.valueOf(cCharAt4))) {
                        return "";
                    }
                    i14++;
                }
                return null;
        }
    }
}
