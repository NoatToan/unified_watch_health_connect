package com.xiaomi.fitness.relative.ui;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.relative.server.model.AccountUserInfo;
import com.xiaomi.fitness.relative.ui.RelativeCareHomePageActivity$requestDataForAddRelative$2$1;
import com.xiaomi.fitness.relative.ui.recycler.ShareDataToFamilyAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/relative/ui/RelativeCareHomePageActivity$requestDataForAddRelative$2$1", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataToFamilyAdapter$OnItemClickListener;", "onClick", "", "userInfo", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeCareHomePageActivity$requestDataForAddRelative$2$1 implements ShareDataToFamilyAdapter.OnItemClickListener {
    final /* synthetic */ RelativeCareHomePageActivity this$0;

    public RelativeCareHomePageActivity$requestDataForAddRelative$2$1(RelativeCareHomePageActivity relativeCareHomePageActivity) {
        this.this$0 = relativeCareHomePageActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$0(RelativeCareHomePageActivity this$0, AccountUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userInfo, "$userInfo");
        this$0.goToShareDataPageDirectly(userInfo);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.relative.ui.recycler.ShareDataToFamilyAdapter.OnItemClickListener
    public void onClick(final AccountUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "initiate_invitation"), TuplesKt.to("method", "my_family"), TuplesKt.to("tip", "56.57.1.1.25019")));
        RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
        final RelativeCareHomePageActivity relativeCareHomePageActivity = this.this$0;
        relativeCareUtil.checkHealthCloudSynchronizationAndProceedIfNeed(relativeCareHomePageActivity, new Function0() { // from class: dfk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RelativeCareHomePageActivity$requestDataForAddRelative$2$1.onClick$lambda$0(relativeCareHomePageActivity, userInfo);
            }
        });
    }
}
