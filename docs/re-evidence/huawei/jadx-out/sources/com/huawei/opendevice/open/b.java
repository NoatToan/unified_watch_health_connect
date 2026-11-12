package com.huawei.opendevice.open;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes41.dex */
public class b extends ClickableSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f21528c;
    private Class<?> e;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f21528c.getResources().getColor(R.color.hiad_functional_blue));
        textPaint.setUnderlineText(false);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        String str;
        hw.b("ClickSpan", "onClick");
        if (this.e == null) {
            hw.c("ClickSpan", "onClick activity is null");
            return;
        }
        try {
            Intent intent = new Intent(this.f21528c, this.e);
            intent.setClipData(Constants.CLIP_DATA);
            this.f21528c.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            str = "onClick startActivity ActivityNotFoundException";
            hw.d("ClickSpan", str);
        } catch (Exception unused2) {
            str = "onClick startActivity Exception";
            hw.d("ClickSpan", str);
        }
    }

    public void a(Class<?> cls) {
        this.e = cls;
    }

    public b(Context context) {
        this.f21528c = context;
    }
}
