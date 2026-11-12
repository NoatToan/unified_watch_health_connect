package com.xiaomi.fitness.health.sleep.utils;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.ImageView;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.request.Disposable;
import coil.request.Gifs;
import coil.request.ImageRequest;
import com.xiaomi.fit.fitness.export.data.annotation.SleepAnimalType;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalDetectingActivity;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalReportActivity;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import defpackage.c0j;
import defpackage.iji;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a6\u0010\b\u001a\u00020\t*\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u0006\u001a\u0016\u0010\u0011\u001a\u00020\t*\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u001a\u0010\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u0014\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u0015\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u0016\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u0017\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u0018\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u0019\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u001d\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u001e\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010\u001f\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u000e\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001\u001a\u0006\u0010\"\u001a\u00020\u0006\u001a$\u0010#\u001a\u00020\t*\u00020\n2\b\b\u0001\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&\u001a\u001a\u0010(\u001a\u00020)*\u00020*2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0001\u001a\u0010\u0010-\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010.\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\u001a\u0010\u0010/\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"ANIMAL_REPORT_NEED_DAYS", "", "CONTENT_ALPHA", "", "TITLE_ALPHA", "SLEEP_DETECTING_ANIMATION_URL", "", "SLEEP_ANIMAL_LOADING_ANIMATION_MIDDLE_WEBP_URL", "gotoSleepAnimalReportActivity", "", "Landroid/content/Context;", "animalReport", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "latestAnimalReport", "showCollectDialog", "", "origin", "gotoSleepAnimalDetectingActivity", "getSleepAnimalEntranceBgUrl", "type", "getSleepAnimalDrawableRes", "getSleepAnimalStringRes", "getSleepAnimalTypeStringRes", "getSleepAnimalEntranceInnerBgColor", "getSleepAnimalEntranceDetailTextColor", "getSleepAnimalEntranceLastUpdateTextColor", "getSleepAnimalEntranceTopCardTitleTextColor", "getSleepAnimalScheduleBgUrl", "getSleepAnimalShareBgUrl", "getSleepAnimalIntroductionStringRes", "getSleepAnimalScheduleStringRes", "getSleepAnimalContinuityStringRes", "getSleepInsightStressLevel", "value", "guideBuyDeviceUrl", "gotoSleepAnimalShareActivity", "animalType", "startTime", "", "endTime", "showGifImage", "Lcoil/request/Disposable;", "Landroid/widget/ImageView;", "url", "placeHolderRes", "getSleepAnimalStrokeColor", "getSleepAnimalEntranceBgStrokeColor", "getSleepAnimalShadowColor", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepAnimalExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAnimalExt.kt\ncom/xiaomi/fitness/health/sleep/utils/SleepAnimalExtKt\n+ 2 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,399:1\n192#2:400\n59#3,6:401\n*S KotlinDebug\n*F\n+ 1 SleepAnimalExt.kt\ncom/xiaomi/fitness/health/sleep/utils/SleepAnimalExtKt\n*L\n335#1:400\n344#1:401,6\n*E\n"})
public final class SleepAnimalExtKt {
    public static final int ANIMAL_REPORT_NEED_DAYS = 7;
    public static final float CONTENT_ALPHA = 0.4f;

    @NotNull
    public static final String SLEEP_ANIMAL_LOADING_ANIMATION_MIDDLE_WEBP_URL = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_animal_loading_size_middle.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=BbVTDuplOt29FOoN65zvH2fxVPk=";

    @NotNull
    public static final String SLEEP_DETECTING_ANIMATION_URL = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_animal_detecting.json?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=psSfP4iddCkYL88DpgZSmrYsUXs=";
    public static final float TITLE_ALPHA = 0.8f;

    public static final int getSleepAnimalContinuityStringRes(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return c0j.Ce;
            case 2:
                return c0j.xe;
            case 3:
                return c0j.Ee;
            case 4:
                return c0j.Be;
            case 5:
                return c0j.Ae;
            case 6:
                return c0j.De;
            default:
                return c0j.De;
        }
    }

    public static final int getSleepAnimalDrawableRes(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return pni.j1;
            case 2:
                return pni.c1;
            case 3:
                return pni.l1;
            case 4:
                return pni.i1;
            case 5:
                return pni.h1;
            case 6:
                return pni.k1;
            default:
                return pni.l1;
        }
    }

    public static final int getSleepAnimalEntranceBgStrokeColor(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return iji.K0;
            case 2:
                return iji.H0;
            case 3:
                return iji.M0;
            case 4:
                return iji.J0;
            case 5:
                return iji.I0;
            case 6:
                return iji.L0;
            default:
                return iji.N0;
        }
    }

    @NotNull
    public static final String getSleepAnimalEntranceBgUrl(@SleepAnimalType int i) {
        boolean zIsNightMode = UIUtils.isNightMode(ApplicationExtKt.getApplication());
        if (i == 1) {
            return !zIsNightMode ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/light/health_sleep_animal_bg_penguin.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=2xApzrPOi0q1c4OZRUfboBShtWw=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/dark/health_sleep_animal_bg_penguin.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=MIMYJIdir4nz+KbmGt1+IPmu5LI=";
        }
        if (i == 2) {
            return !zIsNightMode ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/light/health_sleep_animal_bg_brown_bear.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=r4+/b3GmYJLxb9NtKJtlC5Tm6+A=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/dark/health_sleep_animal_bg_brown_bear.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=KJh/KNHFuLSz/sFOmnAtioPEdPs=";
        }
        if (i == 4) {
            return !zIsNightMode ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/light/health_sleep_animal_bg_night_owl.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=t+qGf70GqyVLOyPB0t/z7+J3dAg=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/dark/health_sleep_animal_bg_night_owl.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=x9xVL6OqfHeI+XlwsZD2/0e62ng=";
        }
        if (i == 5) {
            return !zIsNightMode ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/light/health_sleep_animal_bg_koala.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=hHG+oCIGFHNzX7T7Kz2i/Vx+S20=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/dark/health_sleep_animal_bg_koala.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=wEupi6+FBjm5S3RfaGYQmbuJKbY=";
        }
        if (i != 6) {
            return !zIsNightMode ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/light/health_sleep_animal_bg_sheep.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=4pPBYga7E6JD8lvWon9g5J8uNP4=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/dark/health_sleep_animal_bg_sheep.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=nfa1IMjkr6KeHynBTkiE4ZMdT9g=";
        }
        return !zIsNightMode ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/light/health_sleep_animal_bg_shark.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=1Hqd1rWCNJsj0CCdQ/6+u4XxoT4=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/entrance/dark/health_sleep_animal_bg_shark.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=JkaSorJUz926LB0ZuBKJE2DTLqU=";
    }

    public static final int getSleepAnimalEntranceDetailTextColor(@SleepAnimalType int i) {
        if (i == 2) {
            return iji.i1;
        }
        if (i != 3) {
            return i != 5 ? iji.j1 : iji.k1;
        }
        return iji.l1;
    }

    public static final int getSleepAnimalEntranceInnerBgColor(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return iji.f1;
            case 2:
                return iji.b1;
            case 3:
                return iji.h1;
            case 4:
                return iji.e1;
            case 5:
                return iji.d1;
            case 6:
                return iji.g1;
            default:
                return iji.c1;
        }
    }

    public static final int getSleepAnimalEntranceLastUpdateTextColor(@SleepAnimalType int i) {
        if (i == 2) {
            return iji.m1;
        }
        if (i != 3) {
            return i != 5 ? iji.n1 : iji.o1;
        }
        return iji.p1;
    }

    public static final int getSleepAnimalEntranceTopCardTitleTextColor(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return iji.u1;
            case 2:
                return iji.q1;
            case 3:
                return iji.w1;
            case 4:
                return iji.t1;
            case 5:
                return iji.s1;
            case 6:
                return iji.v1;
            default:
                return iji.r1;
        }
    }

    public static final int getSleepAnimalIntroductionStringRes(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return c0j.hd;
            case 2:
                return c0j.ed;
            case 3:
                return c0j.jd;
            case 4:
                return c0j.gd;
            case 5:
                return c0j.fd;
            case 6:
                return c0j.id;
            default:
                return c0j.jd;
        }
    }

    @NotNull
    public static final String getSleepAnimalScheduleBgUrl(@SleepAnimalType int i) {
        boolean zIsNightMode = UIUtils.isNightMode(ApplicationExtKt.getApplication());
        if (i != 1) {
            if (i == 2) {
                return !zIsNightMode ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/schedule/light/health_sleep_schedule_brown_bear.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=zWjf6K+xOeVdwwmlGvASNfLEiBg=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/schedule/dark/health_sleep_schedule_brown_bear.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=Jpo/Hr/6bJrEhf8txs513y94T5c=";
            }
            if (i != 4) {
                if (i == 5 || i == 6) {
                    return !zIsNightMode ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/schedule/light/health_sleep_schedule_shark_and_koala.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=Nf9RqPHBYeQzgR5prQqXXm2pWZE=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/schedule/dark/health_sleep_schedule_shark_and_koala.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=cvaFbE11JNKf/5gk+kL3zdDRSVw=";
                }
                return !zIsNightMode ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/schedule/light/health_sleep_schedule_sheep.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=+IjMxCSH3R1tUCjC3E3TcDkIjBs=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/schedule/dark/health_sleep_schedule_sheep.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=NKS1/0w0B1YHVMgt84J3cCTEyaQ=";
            }
        }
        return !zIsNightMode ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/schedule/light/health_sleep_schedule_penguin_and_oval.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=MSj/tEFJEvMbFlJdJPtKoaCdZt0=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/schedule/dark/health_sleep_schedule_penguin_and_oval.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=yiR1hlpdC0OekG5qNWRHCQIAgk0=";
    }

    public static final int getSleepAnimalScheduleStringRes(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return c0j.Wj;
            case 2:
                return c0j.Rj;
            case 3:
                return c0j.Yj;
            case 4:
                return c0j.Vj;
            case 5:
                return c0j.Uj;
            case 6:
                return c0j.Xj;
            default:
                return c0j.Xj;
        }
    }

    public static final int getSleepAnimalShadowColor(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return iji.R0;
            case 2:
                return iji.O0;
            case 3:
                return iji.T0;
            case 4:
                return iji.Q0;
            case 5:
                return iji.P0;
            case 6:
                return iji.S0;
            default:
                return iji.T0;
        }
    }

    @NotNull
    public static final String getSleepAnimalShareBgUrl(@SleepAnimalType int i) {
        if (i == 1) {
            return "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/share/health_animal_share_penguin_bg.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=GNi88fGESgheYzJAsUWZ59FONmg=";
        }
        if (i == 2) {
            return "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/share/health_animal_share_brown_bear_bg.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=cyrV6u11+bWCi3WgQasDplGh2+A=";
        }
        if (i == 4) {
            return "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/share/health_animal_share_night_owl_bg.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=n3Bgkbs3It3D0B15fmZwJ+/kcSw=";
        }
        if (i != 5) {
            return i != 6 ? "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/share/health_animal_share_sheep_bg.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=maEHBXLqSy47GBjO23j2PJJjx+o=" : "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/share/health_animal_share_shark_bg.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=X7qrus8+A4yuNoZyc1slhYsO94A=";
        }
        return "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/sleep/animal/share/health_animal_share_koala_bg.webp?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=JxXl5JxysYsyI0LTPL85VKm/H2k=";
    }

    public static final int getSleepAnimalStringRes(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return c0j.pd;
            case 2:
                return c0j.Zc;
            case 3:
                return c0j.td;
            case 4:
                return c0j.nd;
            case 5:
                return c0j.kd;
            case 6:
                return c0j.rd;
            default:
                return c0j.td;
        }
    }

    public static final int getSleepAnimalStrokeColor(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return iji.X0;
            case 2:
                return iji.U0;
            case 3:
                return iji.Z0;
            case 4:
                return iji.W0;
            case 5:
                return iji.V0;
            case 6:
                return iji.Y0;
            default:
                return iji.Z0;
        }
    }

    public static final int getSleepAnimalTypeStringRes(@SleepAnimalType int i) {
        switch (i) {
            case 1:
                return c0j.qd;
            case 2:
                return c0j.ad;
            case 3:
                return c0j.ud;
            case 4:
                return c0j.od;
            case 5:
                return c0j.ld;
            case 6:
                return c0j.sd;
            default:
                return c0j.ud;
        }
    }

    public static final int getSleepInsightStressLevel(int i) {
        if (i > 80) {
            return c0j.dg;
        }
        if (i > 50) {
            return c0j.bg;
        }
        return i > 25 ? c0j.ag : c0j.cg;
    }

    public static final void gotoSleepAnimalDetectingActivity(@NotNull Context context, @Nullable SleepAnimalReport sleepAnimalReport) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent intent = new Intent(context, (Class<?>) SleepAnimalDetectingActivity.class);
        intent.putExtra("latest_animal_report", sleepAnimalReport);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static /* synthetic */ void gotoSleepAnimalDetectingActivity$default(Context context, SleepAnimalReport sleepAnimalReport, int i, Object obj) {
        if ((i & 1) != 0) {
            sleepAnimalReport = null;
        }
        gotoSleepAnimalDetectingActivity(context, sleepAnimalReport);
    }

    public static final void gotoSleepAnimalReportActivity(@NotNull Context context, @Nullable SleepAnimalReport sleepAnimalReport, @Nullable SleepAnimalReport sleepAnimalReport2, boolean z, @SleepAnimalReportPageOrigin @NotNull String origin) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intent intent = new Intent(context, (Class<?>) SleepAnimalReportActivity.class);
        intent.putExtra("report", sleepAnimalReport);
        intent.putExtra("latest_animal_report", sleepAnimalReport2);
        intent.putExtra(SleepAnimalReportActivity.PARAM_SHOW_COLLECT_DIALOG, z);
        intent.putExtra("origin", origin);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static /* synthetic */ void gotoSleepAnimalReportActivity$default(Context context, SleepAnimalReport sleepAnimalReport, SleepAnimalReport sleepAnimalReport2, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            sleepAnimalReport = null;
        }
        if ((i & 2) != 0) {
            sleepAnimalReport2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str = "animal_detecting";
        }
        gotoSleepAnimalReportActivity(context, sleepAnimalReport, sleepAnimalReport2, z, str);
    }

    public static final void gotoSleepAnimalShareActivity(@NotNull Context context, @SleepAnimalType int i, long j, long j2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent intent = new Intent(context, (Class<?>) SleepAnimalShareActivity.class);
        intent.putExtra(SleepAnimalShareActivity.PARAM_ANIMAL_TYPE, i);
        intent.putExtra(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, j);
        intent.putExtra(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, j2);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    @NotNull
    public static final String guideBuyDeviceUrl() {
        return "https://m.mi.com/mfbs/dghd/m_universal?_rt=rn&pageid=11771&pdl=mishop&sign=cc12401e973dfd2803341b68a91e277e&mute=0.1.0.1&g_utm=MIUI.Mijia.Others.xmyd.cdzn2&enter=1";
    }

    @NotNull
    public static final Disposable showGifImage(@NotNull final ImageView imageView, @NotNull String url, final int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Context applicationContext = imageView.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ImageLoader.Builder builder = new ImageLoader.Builder(applicationContext);
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i2 = 1;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            builder2.add(new ImageDecoderDecoder.Factory(z, i2, defaultConstructorMarker));
        } else {
            builder2.add(new GifDecoder.Factory(z, i2, defaultConstructorMarker));
        }
        ImageLoader imageLoaderBuild = builder.components(builder2.build()).build();
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(url).target(imageView);
        Gifs.onAnimationEnd(builderTarget, new Function0() { // from class: hgm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepAnimalExtKt.showGifImage$lambda$5$lambda$4(imageView, i);
            }
        });
        builderTarget.placeholder(i);
        builderTarget.error(i);
        return imageLoaderBuild.enqueue(builderTarget.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showGifImage$lambda$5$lambda$4(ImageView this_showGifImage, int i) {
        Intrinsics.checkNotNullParameter(this_showGifImage, "$this_showGifImage");
        this_showGifImage.setImageResource(i);
        return Unit.INSTANCE;
    }
}
