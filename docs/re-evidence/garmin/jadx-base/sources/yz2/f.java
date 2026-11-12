package yz2;

import android.text.SpannableStringBuilder;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence[] f200491a;

    public f(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            vb.h.s("Label array cannot be null");
            throw null;
        }
        if (charSequenceArr.length >= 12) {
            this.f200491a = charSequenceArr;
        } else {
            vb.h.s("Label array is too short");
            throw null;
        }
    }

    @Override // yz2.g
    public final CharSequence a(xz2.b bVar) {
        return new SpannableStringBuilder().append(this.f200491a[bVar.f192862b]).append((CharSequence) StringUtils.SPACE).append((CharSequence) String.valueOf(bVar.f192861a));
    }
}
