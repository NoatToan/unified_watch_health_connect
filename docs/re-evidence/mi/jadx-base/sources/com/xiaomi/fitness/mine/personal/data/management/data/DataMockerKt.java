package com.xiaomi.fitness.mine.personal.data.management.data;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.mine.personal.data.management.data.model.App;
import com.xiaomi.fitness.mine.personal.data.management.data.model.AuthConfigItem;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyAuthConfigListResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.Scope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u000b\u001a\u00020\f\u001a\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {Constants.KEY_RECHARGE_ICON_URL, "", "xiaomiTv", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/App;", "zeppLife", "theJoyRun", "northTechDepressionStudy", "appList", "", "getAppList", "()Ljava/util/List;", "mockAuthConfigListObject", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyAuthConfigListResult;", "mockScopeList", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/Scope;", "mine_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DataMockerKt {

    @NotNull
    private static final List<App> appList;

    @NotNull
    public static final String iconUrl = "https://tupian.qqw21.com/article/UploadPic/2012-5/201252175053540.jpg";

    @NotNull
    private static final App northTechDepressionStudy;

    @NotNull
    private static final App theJoyRun;

    @NotNull
    private static final App xiaomiTv;

    @NotNull
    private static final App zeppLife;

    static {
        App app = new App(123L, iconUrl, "小米电视", null, null, null, 56, null);
        xiaomiTv = app;
        App app2 = new App(234L, iconUrl, "zeppLife", null, null, null, 56, null);
        zeppLife = app2;
        App app3 = new App(345L, iconUrl, "悦跑圈", null, null, null, 56, null);
        theJoyRun = app3;
        App app4 = new App(456L, iconUrl, "北理工抑郁研究项目", null, null, null, 56, null);
        northTechDepressionStudy = app4;
        appList = CollectionsKt__CollectionsKt.mutableListOf(app, app2, app3, app4);
    }

    @NotNull
    public static final List<App> getAppList() {
        return appList;
    }

    @NotNull
    public static final GetThirdPartyAuthConfigListResult mockAuthConfigListObject() {
        ArrayList arrayList = new ArrayList();
        List<App> list = appList;
        arrayList.add(new AuthConfigItem(1, list));
        arrayList.add(new AuthConfigItem(2, list));
        arrayList.add(new AuthConfigItem(3, list));
        arrayList.add(new AuthConfigItem(4, list));
        return new GetThirdPartyAuthConfigListResult(arrayList);
    }

    @NotNull
    public static final List<Scope> mockScopeList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Scope("运动记录", 0));
        arrayList.add(new Scope("心率", 1));
        arrayList.add(new Scope("卡路里", 1));
        arrayList.add(new Scope("步数", 0));
        return arrayList;
    }
}
