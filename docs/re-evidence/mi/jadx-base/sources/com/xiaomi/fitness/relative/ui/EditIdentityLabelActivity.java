package com.xiaomi.fitness.relative.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.server.model.AcceptInvitationModel;
import com.xiaomi.fitness.relative.server.model.SendInvitationModel;
import com.xiaomi.fitness.relative.ui.EditIdentityLabelActivity;
import com.xiaomi.fitness.relative.ui.model.RecommendationLabelModel;
import com.xiaomi.fitness.relative.ui.recycler.RecommendationLabelAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import defpackage.jfk;
import defpackage.rhi;
import defpackage.t0j;
import defpackage.xui;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001@B\t\b\u0007¢\u0006\u0004\b?\u0010\fJ\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010.\u001a\u0016\u0012\u0004\u0012\u00020,\u0018\u00010+j\n\u0012\u0004\u0012\u00020,\u0018\u0001`-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001eR\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u001cR\u0016\u00102\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010\u001cR\u0018\u00108\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0018\u00109\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010<\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/EditIdentityLabelActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Ljfk;", "", "skip", "", "checkAndHandleRequest", "(Z)V", "acceptInvitation", "sendInvitation", "modifyIdentityLabel", "()V", "Lkotlin/Function0;", "confirmAndSendRequest", "checkAndGetIdentityLabel", "(ZLkotlin/jvm/functions/Function0;)V", "setRecommendationLabelLayout", "", "position", "updateRecommendationLabelModel", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "relativeUid", "Ljava/lang/Long;", "relativesSettlingFlag", "Z", "dataShareTimeScope", "Ljava/lang/Integer;", "Lcom/xiaomi/fitness/relative/ui/recycler/RecommendationLabelAdapter;", "recommendationLabelAdapter", "Lcom/xiaomi/fitness/relative/ui/recycler/RecommendationLabelAdapter;", "Lcom/xiaomi/fitness/relative/ui/model/RecommendationLabelModel;", "recommendationLabelModel", "Lcom/xiaomi/fitness/relative/ui/model/RecommendationLabelModel;", "getRecommendationLabelModel", "()Lcom/xiaomi/fitness/relative/ui/model/RecommendationLabelModel;", "setRecommendationLabelModel", "(Lcom/xiaomi/fitness/relative/ui/model/RecommendationLabelModel;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lkotlin/collections/ArrayList;", "homeDataTypArrayList", "Ljava/util/ArrayList;", "isAcceptanceProcess", PkConstants.PARAM_INVITE_ID, "msgId", "J", "", "identityLabel", "Ljava/lang/String;", "inviteLinkId", "relativeNode", "origin", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EditIdentityLabelActivity extends Hilt_EditIdentityLabelActivity<RelativeCareViewModel, jfk> {

    @NotNull
    public static final String TAG = "EditIdentityLabelActivity";

    @Nullable
    private Integer dataShareTimeScope;

    @Nullable
    private ArrayList<HomeDataType> homeDataTypArrayList;

    @Nullable
    private String identityLabel;

    @Nullable
    private Long inviteId;

    @Nullable
    private Long inviteLinkId;
    private boolean isAcceptanceProcess;
    private long msgId;

    @Nullable
    private String origin;

    @Nullable
    private RecommendationLabelAdapter recommendationLabelAdapter;

    @Nullable
    private RecommendationLabelModel recommendationLabelModel;

    @Nullable
    private String relativeNode;

    @Nullable
    private Long relativeUid;
    private boolean relativesSettlingFlag;

    private final void acceptInvitation(final boolean skip) {
        checkAndGetIdentityLabel(skip, new Function0() { // from class: k28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditIdentityLabelActivity.acceptInvitation$lambda$3(this.f23356a, skip);
            }
        });
    }

    public static /* synthetic */ void acceptInvitation$default(EditIdentityLabelActivity editIdentityLabelActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        editIdentityLabelActivity.acceptInvitation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit acceptInvitation$lambda$3(final EditIdentityLabelActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long j = this$0.msgId;
        Long l = this$0.inviteId;
        Intrinsics.checkNotNull(l);
        long jLongValue = l.longValue();
        ArrayList<HomeDataType> arrayList = this$0.homeDataTypArrayList;
        AcceptInvitationModel acceptInvitationModel = new AcceptInvitationModel(j, jLongValue, arrayList != null ? CollectionsKt___CollectionsKt.toList(arrayList) : null, null, null, 24, null);
        acceptInvitationModel.setAuthTimeScope(this$0.dataShareTimeScope);
        acceptInvitationModel.setRelativeNode(z ? null : this$0.identityLabel);
        ((RelativeCareViewModel) this$0.getMViewModel()).acceptInvitation(acceptInvitationModel).observe(this$0, new EditIdentityLabelActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i28
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditIdentityLabelActivity.acceptInvitation$lambda$3$lambda$2(this.f20692a, (RelativeResult) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acceptInvitation$lambda$3$lambda$2(EditIdentityLabelActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.mapOf(TuplesKt.to("name", "accept_invitation"), TuplesKt.to("result", Boolean.TRUE), TuplesKt.to("user_id", MD5Util.MD5(String.valueOf(this$0.relativeUid))), TuplesKt.to("tip", "56.54.1.1.25036")));
            this$0.startActivity(new Intent(this$0, (Class<?>) RelationshipEstablishedActivity.class));
        } else {
            ToastExtKt.toastShort(this$0, t0j.e0);
            Logger.i(TAG, "acceptInvitation failed. errorCode=" + relativeResult.getErrorMsg() + " errorMsg=" + relativeResult.getErrorMsg());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ jfk access$getMBinding(EditIdentityLabelActivity editIdentityLabelActivity) {
        return (jfk) editIdentityLabelActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkAndGetIdentityLabel(boolean skip, Function0<Unit> confirmAndSendRequest) {
        if (!skip) {
            Editable text = ((jfk) getMBinding()).A.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            String string = StringsKt__StringsKt.trim(text).toString();
            this.identityLabel = string;
            Intrinsics.checkNotNull(string);
            if (string.length() > 30) {
                ToastExtKt.toastShort(this, t0j.h0);
                return;
            }
        }
        confirmAndSendRequest.invoke();
    }

    private final void checkAndHandleRequest(boolean skip) {
        if (!NetUtil.INSTANCE.getNetWorkAvailable(this)) {
            ToastExtKt.toastShort(this, t0j.d0);
            return;
        }
        if (this.relativesSettlingFlag) {
            modifyIdentityLabel();
        } else if (this.isAcceptanceProcess) {
            acceptInvitation(skip);
        } else {
            sendInvitation(skip);
        }
    }

    public static /* synthetic */ void checkAndHandleRequest$default(EditIdentityLabelActivity editIdentityLabelActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        editIdentityLabelActivity.checkAndHandleRequest(z);
    }

    private final void modifyIdentityLabel() {
        checkAndGetIdentityLabel(false, new Function0() { // from class: h28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditIdentityLabelActivity.modifyIdentityLabel$lambda$7(this.f19602a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit modifyIdentityLabel$lambda$7(final EditIdentityLabelActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) this$0.getMViewModel();
        Long l = this$0.relativeUid;
        Intrinsics.checkNotNull(l);
        long jLongValue = l.longValue();
        String str = this$0.identityLabel;
        if (str == null) {
            str = "";
        }
        relativeCareViewModel.modifyRelativeNode(jLongValue, str).observe(this$0, new EditIdentityLabelActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: g28
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditIdentityLabelActivity.modifyIdentityLabel$lambda$7$lambda$6(this.f18499a, (RelativeResult) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit modifyIdentityLabel$lambda$7$lambda$6(EditIdentityLabelActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            ToastExtKt.toastShort(this$0, t0j.J);
            Intent intent = new Intent();
            intent.putExtra("ket_request_set_node", this$0.identityLabel);
            this$0.setResult(-1, intent);
            this$0.finish();
            Logger.i(TAG, "nodeInvitation success. data=" + relativeResult.getData() + " errorMsg=" + relativeResult.getErrorMsg());
        } else {
            ToastExtKt.toastShort(this$0, t0j.e0);
            Logger.i(TAG, "nodeInvitation failed. data=" + relativeResult.getData() + " errorMsg=" + relativeResult.getErrorMsg());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(EditIdentityLabelActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkAndHandleRequest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(EditIdentityLabelActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.checkAndHandleRequest(false);
        return Unit.INSTANCE;
    }

    private final void sendInvitation(final boolean skip) {
        checkAndGetIdentityLabel(skip, new Function0() { // from class: d28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditIdentityLabelActivity.sendInvitation$lambda$5(skip, this);
            }
        });
    }

    public static /* synthetic */ void sendInvitation$default(EditIdentityLabelActivity editIdentityLabelActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        editIdentityLabelActivity.sendInvitation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit sendInvitation$lambda$5(boolean z, final EditIdentityLabelActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SendInvitationModel sendInvitationModel = new SendInvitationModel(null, null, null, null, null, 31, null);
        sendInvitationModel.setRelativeNode(z ? null : this$0.identityLabel);
        sendInvitationModel.setRelativeId(this$0.relativeUid);
        sendInvitationModel.setAuthTimeScope(this$0.dataShareTimeScope);
        ArrayList<HomeDataType> arrayList = this$0.homeDataTypArrayList;
        sendInvitationModel.setAuthTypes(arrayList != null ? CollectionsKt___CollectionsKt.toList(arrayList) : null);
        Long l = this$0.inviteLinkId;
        if (l == null || l.longValue() != 0) {
            sendInvitationModel.setInviteLinkId(this$0.inviteLinkId);
        }
        ((RelativeCareViewModel) this$0.getMViewModel()).sendInvitation(sendInvitationModel).observe(this$0, new EditIdentityLabelActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j28
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditIdentityLabelActivity.sendInvitation$lambda$5$lambda$4(this.f22349a, (RelativeResult) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendInvitation$lambda$5$lambda$4(EditIdentityLabelActivity this$0, RelativeResult relativeResult) {
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess() && Intrinsics.areEqual(relativeResult.getData(), Boolean.TRUE)) {
            Intent intent = new Intent(this$0, (Class<?>) InvitationSentSuccessfullyActivity.class);
            intent.putExtras(this$0.getIntent());
            if (Intrinsics.areEqual(this$0.origin, "account")) {
                intent.setFlags(268468224);
            }
            this$0.startActivity(intent);
        } else {
            Logger.i(TAG, "sendInvitation failed. errorCode=" + relativeResult.getErrorCode() + " errorMsg=" + relativeResult.getErrorMsg());
            int errorCode = relativeResult.getErrorCode();
            if (errorCode != 1003) {
                i = errorCode != 1004 ? t0j.Q : t0j.m;
            } else {
                i = t0j.m0;
            }
            ToastExtKt.toastShort(this$0, i);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setRecommendationLabelLayout() {
        String[] stringArray = getApplication().getResources().getStringArray(rhi.f32550a);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        this.recommendationLabelModel = new RecommendationLabelModel(ArraysKt___ArraysKt.toList(stringArray), null);
        RecommendationLabelAdapter recommendationLabelAdapter = new RecommendationLabelAdapter();
        this.recommendationLabelAdapter = recommendationLabelAdapter;
        recommendationLabelAdapter.setOnItemSelectedListener(new RecommendationLabelAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.relative.ui.EditIdentityLabelActivity.setRecommendationLabelLayout.1
            @Override // com.xiaomi.fitness.relative.ui.recycler.RecommendationLabelAdapter.OnItemClickListener
            public void onItemClick(int position) {
                String str;
                RecommendationLabelAdapter recommendationLabelAdapter2 = EditIdentityLabelActivity.this.recommendationLabelAdapter;
                boolean zIsPositionAlreadySelected = recommendationLabelAdapter2 != null ? recommendationLabelAdapter2.isPositionAlreadySelected(position) : false;
                EditIdentityLabelActivity.this.updateRecommendationLabelModel(position);
                RecommendationLabelAdapter recommendationLabelAdapter3 = EditIdentityLabelActivity.this.recommendationLabelAdapter;
                if (recommendationLabelAdapter3 != null) {
                    RecommendationLabelModel recommendationLabelModel = EditIdentityLabelActivity.this.getRecommendationLabelModel();
                    Intrinsics.checkNotNull(recommendationLabelModel);
                    recommendationLabelAdapter3.refreshRecommendationLabelLayout(recommendationLabelModel);
                }
                if (zIsPositionAlreadySelected) {
                    str = "";
                } else {
                    RecommendationLabelModel recommendationLabelModel2 = EditIdentityLabelActivity.this.getRecommendationLabelModel();
                    Intrinsics.checkNotNull(recommendationLabelModel2);
                    str = recommendationLabelModel2.getLabels().get(position);
                }
                EditIdentityLabelActivity.access$getMBinding(EditIdentityLabelActivity.this).A.setText(str);
            }
        });
        RecyclerView recommendationTags = ((jfk) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(recommendationTags, "recommendationTags");
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.T(1);
        flexboxLayoutManager.U(0);
        recommendationTags.setLayoutManager(flexboxLayoutManager);
        recommendationTags.setAdapter(this.recommendationLabelAdapter);
        RecommendationLabelAdapter recommendationLabelAdapter2 = this.recommendationLabelAdapter;
        if (recommendationLabelAdapter2 != null) {
            RecommendationLabelModel recommendationLabelModel = this.recommendationLabelModel;
            Intrinsics.checkNotNull(recommendationLabelModel);
            recommendationLabelAdapter2.refreshRecommendationLabelLayout(recommendationLabelModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRecommendationLabelModel(int position) {
        RecommendationLabelAdapter recommendationLabelAdapter = this.recommendationLabelAdapter;
        if (recommendationLabelAdapter != null) {
            recommendationLabelAdapter.setSelectedPosition((recommendationLabelAdapter == null || !recommendationLabelAdapter.isPositionAlreadySelected(position)) ? Integer.valueOf(position) : null);
        }
        RecommendationLabelModel recommendationLabelModel = this.recommendationLabelModel;
        if (recommendationLabelModel != null) {
            RecommendationLabelAdapter recommendationLabelAdapter2 = this.recommendationLabelAdapter;
            recommendationLabelModel.setSelectedPosition(recommendationLabelAdapter2 != null ? recommendationLabelAdapter2.getSelectedPosition() : null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return xui.f;
    }

    @Nullable
    public final RecommendationLabelModel getRecommendationLabelModel() {
        return this.recommendationLabelModel;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.relative.ui.Hilt_EditIdentityLabelActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(t0j.I);
        this.relativeUid = Long.valueOf(getIntent().getLongExtra("key_relative_uid", 0L));
        String stringExtra = getIntent().getStringExtra("origin");
        this.origin = stringExtra;
        Logger.d(TAG, "origin=" + stringExtra);
        this.relativeNode = getIntent().getStringExtra(RelativeCareConstants.KEY_ACCOUNT_NICKNAME);
        this.relativesSettlingFlag = getIntent().getBooleanExtra(RelativeCareConstants.KEY_RELATIVE_SET, false);
        this.msgId = getIntent().getLongExtra(RelativeCareConstants.KEY_MSG_ID, 0L);
        this.dataShareTimeScope = Integer.valueOf(getIntent().getIntExtra(RelativeCareConstants.KEY_DATA_SHARE_TIME_SCOPE, 3));
        this.homeDataTypArrayList = getIntent().getParcelableArrayListExtra(RelativeCareConstants.KEY_AUTH_DATA_LIST);
        this.isAcceptanceProcess = getIntent().getBooleanExtra(RelativeCareConstants.KEY_IS_ACCEPTANCE_PROCESS, false);
        this.inviteId = Long.valueOf(getIntent().getLongExtra(RelativeCareConstants.KEY_INVITE_ID, 0L));
        this.inviteLinkId = Long.valueOf(getIntent().getLongExtra(RelativeCareConstants.KEY_INVITE_LINK_ID, 0L));
        if (this.relativeNode != null) {
            ((jfk) getMBinding()).A.setText(this.relativeNode);
        }
        if (!this.relativesSettlingFlag) {
            int i = t0j.h;
            IActionBar.DefaultImpls.setEndTextView$default(this, 0, i, getString(i), ExtUtilsKt.getSp(Float.valueOf(6.0f)), new View.OnClickListener() { // from class: e28
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditIdentityLabelActivity.onCreate$lambda$0(this.f16190a, view);
                }
            }, 1, null);
        }
        Logger.i(TAG, "relativeUid=" + this.relativeUid + ", isAcceptanceProcess=" + this.isAcceptanceProcess + ", msgId=" + this.msgId + ", inviteId=" + this.inviteId + ",relativeSet = " + this.relativesSettlingFlag + ",dataShareTimeScope = " + this.dataShareTimeScope);
        Long l = this.relativeUid;
        if (l != null && l.longValue() == 0) {
            ToastExtKt.toastShort(this, "relativeUid==0L");
        } else {
            setRecommendationLabelLayout();
            ViewExtKt.clickWithTrigger$default(((jfk) getMBinding()).B, 0L, new Function1() { // from class: f28
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EditIdentityLabelActivity.onCreate$lambda$1(this.f17327a, (TextView) obj);
                }
            }, 1, null);
        }
    }

    public final void setRecommendationLabelModel(@Nullable RecommendationLabelModel recommendationLabelModel) {
        this.recommendationLabelModel = recommendationLabelModel;
    }
}
