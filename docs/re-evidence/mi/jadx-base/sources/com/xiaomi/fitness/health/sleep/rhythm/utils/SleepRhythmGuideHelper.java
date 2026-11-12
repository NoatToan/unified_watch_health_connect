package com.xiaomi.fitness.health.sleep.rhythm.utils;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.health.sleep.rhythm.adapter.SleepRhythmGuideEntity;
import defpackage.c0j;
import defpackage.iji;
import defpackage.ne5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u0010\u0012\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/utils/SleepRhythmGuideHelper;", "", "<init>", "()V", "GUIDE_IMAGE_URI_1", "", "GUIDE_IMAGE_URI_2", "GUIDE_IMAGE_URI_3", "GUIDE_IMAGE_URI_4", "buildSleepRhythmGuideList", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuideEntity;", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "buildSleepRhythmSecondPageSpannable", "Landroid/text/SpannableStringBuilder;", TSMAuthContants.PARAM_RESOURCE, "Landroid/content/res/Resources;", "setColorAndBoldSpanByIndex", "startIndex", "", "endIndex", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepRhythmGuideHelper {

    @NotNull
    private static final String GUIDE_IMAGE_URI_1 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/rhythm/health_rhythm_guide_first_v1.png?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=8aDaIUXekkUaiA+wdN3vS4/1eWQ=";

    @NotNull
    private static final String GUIDE_IMAGE_URI_2 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/rhythm/health_rhythm_guide_second_v1.png?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=PhpYlc8/Z/8TGCVOANGtWxQNBjA=";

    @NotNull
    private static final String GUIDE_IMAGE_URI_3 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/rhythm/health_rhythm_guide_third_v1.png?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=eQLXWQmFP6SxeIeQ16XuKdMV/cE=";

    @NotNull
    public static final String GUIDE_IMAGE_URI_4 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/rhythm/health_rhythm_guide_fourth_v1.png?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=3E0DwVYKMPBZviCoqL0N1pYUbvo=";

    @NotNull
    public static final SleepRhythmGuideHelper INSTANCE = new SleepRhythmGuideHelper();

    private SleepRhythmGuideHelper() {
    }

    private final SpannableStringBuilder buildSleepRhythmSecondPageSpannable(Resources resource) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = resource.getString(c0j.bj);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        spannableStringBuilder.append((CharSequence) string);
        setColorAndBoldSpanByIndex(spannableStringBuilder, resource, 0, string.length());
        spannableStringBuilder.append((CharSequence) resource.getString(c0j.aj));
        spannableStringBuilder.append((CharSequence) "\n\n");
        String string2 = resource.getString(c0j.hj);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        spannableStringBuilder.append((CharSequence) string2);
        setColorAndBoldSpanByIndex(spannableStringBuilder, resource, spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length());
        spannableStringBuilder.append((CharSequence) resource.getString(c0j.gj));
        spannableStringBuilder.append((CharSequence) "\n\n");
        String string3 = resource.getString(c0j.fj);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        spannableStringBuilder.append((CharSequence) string3);
        setColorAndBoldSpanByIndex(spannableStringBuilder, resource, spannableStringBuilder.length() - string3.length(), spannableStringBuilder.length());
        spannableStringBuilder.append((CharSequence) resource.getString(c0j.ej));
        spannableStringBuilder.append((CharSequence) "\n\n");
        String string4 = resource.getString(c0j.dj);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        spannableStringBuilder.append((CharSequence) string4);
        setColorAndBoldSpanByIndex(spannableStringBuilder, resource, spannableStringBuilder.length() - string4.length(), spannableStringBuilder.length());
        spannableStringBuilder.append((CharSequence) resource.getString(c0j.cj));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) resource.getString(c0j.Si));
        return spannableStringBuilder;
    }

    private final SpannableStringBuilder setColorAndBoldSpanByIndex(SpannableStringBuilder spannableStringBuilder, Resources resources, int i, int i2) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(resources.getColor(iji.r3, null));
        new StyleSpan(1);
        Typeface typefaceCreate = Typeface.create("mipro-regular", 1);
        spannableStringBuilder.setSpan(foregroundColorSpan, i, i2, 17);
        if (typefaceCreate != null) {
            spannableStringBuilder.setSpan(new ne5(typefaceCreate), i, i2, 17);
        }
        return spannableStringBuilder;
    }

    @NotNull
    public final List<SleepRhythmGuideEntity> buildSleepRhythmGuideList(@NotNull BaseActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SleepRhythmGuideEntity(GUIDE_IMAGE_URI_1, resources.getString(c0j.ij), resources.getString(c0j.Ri), null, null, 24, null));
        String string = resources.getString(c0j.jj);
        Intrinsics.checkNotNull(resources);
        arrayList.add(new SleepRhythmGuideEntity(GUIDE_IMAGE_URI_2, string, buildSleepRhythmSecondPageSpannable(resources), resources.getString(c0j.kj), resources.getString(c0j.Ti)));
        arrayList.add(new SleepRhythmGuideEntity(GUIDE_IMAGE_URI_3, resources.getString(c0j.lj), resources.getString(c0j.Vi), null, null, 24, null));
        arrayList.add(new SleepRhythmGuideEntity(GUIDE_IMAGE_URI_4, null, "", null, null, 26, null));
        return arrayList;
    }
}
