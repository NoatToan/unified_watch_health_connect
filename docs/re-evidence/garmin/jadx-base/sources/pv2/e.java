package pv2;

import android.text.InputFilter;
import android.text.Spanned;
import d53.w;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpv2/e;", "Landroid/text/InputFilter;", "", "max", "", "isEditing", "Lkotlin/Function1;", "", "onFilter", "<init>", "(DZLe23/l;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f141683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Boolean, Unit> f141684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f141685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141686d = 2;

    /* JADX WARN: Multi-variable type inference failed */
    public e(double d14, boolean z14, l<? super Boolean, Unit> lVar) {
        this.f141683a = z14;
        this.f141684b = lVar;
        this.f141685c = d14;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r10 <= 0.0d) goto L23;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
        l<Boolean, Unit> lVar = this.f141684b;
        charSequence.getClass();
        spanned.getClass();
        if (this.f141683a) {
            try {
                String strConcat = spanned.toString().substring(0, i16).concat(spanned.toString().substring(i17, spanned.toString().length()));
                String str = strConcat.substring(0, i16) + ((Object) charSequence) + strConcat.substring(i16, strConcat.length());
                if (w.G('.', 0, 6, str) == -1 || (str.length() - w.G('.', 0, 6, str)) - 1 <= this.f141686d) {
                    double d14 = Double.parseDouble(str);
                    double d15 = this.f141685c;
                    if (d15 > 0.0d) {
                        if (0.0d <= d14 && d14 <= d15) {
                            if (lVar != null) {
                                lVar.invoke(Boolean.FALSE);
                            }
                        }
                        if (lVar != null) {
                            lVar.invoke(Boolean.TRUE);
                        }
                    } else {
                        if (d15 <= d14) {
                        }
                        if (lVar != null) {
                            lVar.invoke(Boolean.TRUE);
                        }
                    }
                } else if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                    return "";
                }
            } catch (NumberFormatException unused) {
            }
            return "";
        }
        return null;
    }
}
