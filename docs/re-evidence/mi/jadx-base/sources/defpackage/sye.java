package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.xiaomi.fitness.baseui.widget.MLTextView;
import com.xiaomi.fitness.common.utils.RomUtils;

/* JADX INFO: loaded from: classes7.dex */
public class sye extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MLTextView f34103a;

    public sye(MLTextView mLTextView, TextPaint textPaint) {
        super(textPaint);
        this.f34103a = mLTextView;
    }

    @Override // android.graphics.Paint
    public void setFakeBoldText(boolean z) {
        if (z && RomUtils.isXiaomi()) {
            this.f34103a.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            super.setFakeBoldText(z);
        }
    }
}
