package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity;

/* JADX INFO: loaded from: classes19.dex */
public class wmt extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f52208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f52209b;
    private boolean d;
    private BaseResponseCallback<Object> e;

    public wmt(Context context, String str) {
        this(context, str, true);
    }

    public wmt(Context context, String str, boolean z) {
        this.f52208a = context;
        this.f52209b = str;
        this.d = z;
    }

    public wmt(Context context, String str, boolean z, BaseResponseCallback<Object> baseResponseCallback) {
        this.f52208a = context;
        this.f52209b = str;
        this.d = z;
        this.e = baseResponseCallback;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        LogUtil.a("MyClickableSpan", "ClickableSpan_onClick");
        if (qrs.c(500)) {
            LogUtil.a("MyClickableSpan", "isFastClick");
            return;
        }
        if (this.f52208a != null) {
            LogUtil.a("MyClickableSpan", "ClickableSpan_START");
            Intent intent = new Intent(this.f52208a, (Class<?>) ServiceItemActivity.class);
            intent.putExtra("Agreement_key", this.f52209b);
            intent.putExtra("Is_show_cancel_key", this.d);
            intent.addFlags(268435456);
            this.f52208a.startActivity(intent);
            BaseResponseCallback<Object> baseResponseCallback = this.e;
            if (baseResponseCallback != null) {
                baseResponseCallback.onResponse(0, null);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            super.updateDrawState(textPaint);
            textPaint.setColor(Color.parseColor("#fb6522"));
            textPaint.setUnderlineText(false);
        }
    }
}
