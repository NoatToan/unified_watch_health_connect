package com.xiaomi.fitness.access.wechatsportimport;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerActivity;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.aui;
import defpackage.mzi;
import defpackage.n70;
import defpackage.yii;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/access/wechatsportimport/WechatSportSettingsNoDevicesActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/access/wechatsportimport/manager/AccessDeviceManagerViewModel;", "Ln70;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "()V", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WechatSportSettingsNoDevicesActivity extends BaseBindingActivity<AccessDeviceManagerViewModel, n70> {
    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return aui.o;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(mzi.u0);
        String string = getString(mzi.common_faq);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(mzi.t0, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string2, string, 0, false, 6, (Object) null);
        int length = string.length() + iIndexOf$default;
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.access.wechatsportimport.WechatSportSettingsNoDevicesActivity$onCreate$clickCallback$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                WebViewUtilKt.startWebView$default(AccessDeviceManagerActivity.URL_WECHAT_SPORT_SETTING_FAQ, this.this$0.getString(mzi.common_faq), false, false, null, false, null, false, 252, null);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
                ds.setColor(ResourceExtKt.getResourceColor(this.this$0, yii.c));
                ds.setFakeBoldText(false);
            }
        }, iIndexOf$default, length, 17);
        getMBinding().A.setMovementMethod(LinkMovementMethod.getInstance());
        getMBinding().A.setText(spannableString);
    }
}
