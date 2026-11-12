package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/ImageSpanUtil;", "", "Lkotlin/Function0;", "", "clickAction", "Landroid/text/SpannableString;", "getSpan", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/lang/String;", "getStr", "()Ljava/lang/String;", "str", "", "c", LogUtil.I, "getDrawable", "()I", "drawable", "<init>", "(Landroid/content/Context;Ljava/lang/String;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ImageSpanUtil {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String str;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int drawable;

    public ImageSpanUtil(@NotNull Context context, @NotNull String str, @DrawableRes int i) {
        this.context = context;
        this.str = str;
        this.drawable = i;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final int getDrawable() {
        return this.drawable;
    }

    @NotNull
    public final SpannableString getSpan(@NotNull final Function0<Unit> clickAction) {
        String str = this.str + " ";
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ImageSpan(this.context, this.drawable, 1), str.length() - 1, str.length(), 33);
        spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.ImageSpanUtil$getSpan$clickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NotNull View widget) {
                clickAction.invoke();
            }
        }, str.length() - 1, str.length(), 33);
        return spannableString;
    }

    @NotNull
    public final String getStr() {
        return this.str;
    }
}
