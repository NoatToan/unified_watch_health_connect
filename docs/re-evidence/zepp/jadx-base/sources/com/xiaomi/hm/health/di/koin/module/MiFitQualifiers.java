package com.xiaomi.hm.health.di.koin.module;

import com.google.android.gms.stats.CodePackage;
import com.huami.android.zxing.Intents;
import com.huami.hmchartui.utils.Constant;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/module/MiFitQualifiers;", "", "", "TOKEN", "Ljava/lang/String;", HTTP.HOST, Constant.USER_ID, "NICKNAME", "AVATAR", "AGE", "IS_MALE", CodePackage.LOCATION, "SUMMARY", Intents.WifiConnect.TYPE, "BOUND_HR_DEVICE", "CREATED_TIME", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MiFitQualifiers {

    @NotNull
    public static final String AGE = "Age";

    @NotNull
    public static final String AVATAR = "Avatar";

    @NotNull
    public static final String BOUND_HR_DEVICE = "BoundHrDevice";

    @NotNull
    public static final String CREATED_TIME = "Created_Time";

    @NotNull
    public static final String HOST = "Host";

    @NotNull
    public static final MiFitQualifiers INSTANCE = new MiFitQualifiers();

    @NotNull
    public static final String IS_MALE = "Gender";

    @NotNull
    public static final String LOCATION = "Location";

    @NotNull
    public static final String NICKNAME = "Nickname";

    @NotNull
    public static final String SUMMARY = "Summary";

    @NotNull
    public static final String TOKEN = "Token";

    @NotNull
    public static final String TYPE = "Type";

    @NotNull
    public static final String USER_ID = "UserId";

    private MiFitQualifiers() {
    }
}
