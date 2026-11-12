package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.main.stories.settings.activity.heartrate.InstructionOfHrrHeartRateActivity;
import com.huawei.ui.main.stories.settings.activity.heartrate.InstructionOfMaxHeartRateActivity;

/* JADX INFO: loaded from: classes19.dex */
public class wma extends ClickableSpan {
    private boolean e;

    public wma(boolean z) {
        this.e = z;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Intent intent;
        Context context = BaseApplication.getContext();
        if (context == null) {
            return;
        }
        if (this.e) {
            intent = new Intent(context, (Class<?>) InstructionOfMaxHeartRateActivity.class);
        } else {
            intent = new Intent(context, (Class<?>) InstructionOfHrrHeartRateActivity.class);
        }
        intent.addFlags(268435456);
        iov.d(context, intent);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(Color.parseColor("#fb6522"));
        textPaint.setUnderlineText(false);
    }
}
