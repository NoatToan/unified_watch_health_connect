package com.xiaomi.fitness.health.sleep.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extension.PageUtilExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAudioUnderstandFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepPermissionSettingFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment;
import com.xiaomi.fitness.homepage.HealthViewModel;
import defpackage.c0j;
import defpackage.dih;
import defpackage.iji;
import defpackage.jui;
import defpackage.qge;
import defpackage.ula;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepAudioUnderstandFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/homepage/HealthViewModel;", "Lula;", "", "originalText", "", "highColorId", "Lkotlin/Function0;", "", "onClickListener", "Landroid/text/SpannableString;", "setClickAble", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;)Landroid/text/SpannableString;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getLayoutId", "()I", "layoutId", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepAudioUnderstandFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAudioUnderstandFragment.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepAudioUnderstandFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,97:1\n13467#2,3:98\n*S KotlinDebug\n*F\n+ 1 SleepAudioUnderstandFragment.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepAudioUnderstandFragment\n*L\n76#1:98,3\n*E\n"})
public final class SleepAudioUnderstandFragment extends BaseBindingFragment<HealthViewModel, ula> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SleepAudioUnderstandFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dih dihVarA = dih.a();
        if (dihVarA != null) {
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            PageUtilExtKt.goCommonActivity(dihVarA, contextRequireContext, SleepSettingFragment.class, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SleepAudioUnderstandFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dih dihVarA = dih.a();
        if (dihVarA != null) {
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            PageUtilExtKt.goCommonActivity(dihVarA, contextRequireContext, SleepPermissionSettingFragment.class, null);
        }
        return Unit.INSTANCE;
    }

    private final SpannableString setClickAble(String originalText, final int highColorId, final Function0<Unit> onClickListener) {
        Spanned spannedFromHtml = Html.fromHtml(originalText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        SpannableString spannableString = new SpannableString(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        Intrinsics.checkNotNull(uRLSpanArr);
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.health.sleep.ui.SleepAudioUnderstandFragment$setClickAble$1$clickableSpan$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    onClickListener.invoke();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    super.updateDrawState(ds);
                    int i = highColorId;
                    if (i != -1) {
                        ds.setColor(ExtUtilsKt.getColor(i));
                    }
                    ds.setUnderlineText(true);
                }
            }, spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 33);
            spannableString.removeSpan(uRLSpan);
        }
        return spannableString;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.e2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.sk);
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        TextView description1 = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(description1, "description1");
        String string = requireContext().getString(c0j.tk);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        description1.setText(setClickAble(string, iji.f21230k, new Function0() { // from class: thm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepAudioUnderstandFragment.onViewCreated$lambda$0(this.f34711a);
            }
        }));
        StringExtKt.clickSpannable$default(string, null, 0, 0, new Function2() { // from class: uhm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepAudioUnderstandFragment.onViewCreated$lambda$1((String) obj, (String) obj2);
            }
        }, 7, null);
        description1.setMovementMethod(qge.getInstance());
        String string2 = requireContext().getString(c0j.rk);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        TextView description2 = getMBinding().B;
        Intrinsics.checkNotNullExpressionValue(description2, "description2");
        description2.setText(setClickAble(string2, iji.f21230k, new Function0() { // from class: vhm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepAudioUnderstandFragment.onViewCreated$lambda$2(this.f36907a);
            }
        }));
        description2.setMovementMethod(qge.getInstance());
    }
}
