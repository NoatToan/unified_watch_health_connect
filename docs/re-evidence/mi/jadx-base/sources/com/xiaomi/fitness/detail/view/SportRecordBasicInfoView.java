package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.Disposable;
import coil.request.ImageRequest;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.recycler.SportBasicInfoItemDecoration;
import com.xiaomi.fitness.detail.recycler.SportDetailAdapter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.pz9;
import defpackage.qod;
import defpackage.rz5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00107\u001a\u000206\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0004J?\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportRecordBasicInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "initRecycler", "()V", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "basicInfo", "Landroid/widget/TextView;", "title", "value", "setBasicInfo", "(Lcom/xiaomi/fitness/detail/data/BasicItemInfo;Landroid/widget/TextView;Landroid/widget/TextView;)V", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountCoreInfo", "", "isCommonSport", "updateHeaderInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;Z)V", "cancelAvatarLoad", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "basicReport", "", "dataList", "", "sportName", "needUpdateCourseName", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/util/List;Ljava/lang/String;ZZ)V", "courseName", "bindCourseName", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter;", "mDetailAdapter", "Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter;", "", "Lrz5;", "mDetailList", "Ljava/util/List;", "Lqod;", "binding", "Lqod;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerSportInfo", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "userInfoMgr", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getUserInfoMgr", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setUserInfoMgr", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "Lcoil/request/Disposable;", "avatarAddressLoadDisposable", "Lcoil/request/Disposable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportRecordBasicInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordBasicInfoView.kt\ncom/xiaomi/fitness/detail/view/SportRecordBasicInfoView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,207:1\n54#2,3:208\n24#2:211\n59#2,6:212\n*S KotlinDebug\n*F\n+ 1 SportRecordBasicInfoView.kt\ncom/xiaomi/fitness/detail/view/SportRecordBasicInfoView\n*L\n90#1:208,3\n90#1:211\n90#1:212,6\n*E\n"})
public final class SportRecordBasicInfoView extends ConstraintLayout {

    @Nullable
    private Disposable avatarAddressLoadDisposable;

    @NotNull
    private final qod binding;
    private SportDetailAdapter mDetailAdapter;
    private List<rz5> mDetailList;

    @NotNull
    private RecyclerView recyclerSportInfo;

    @NotNull
    private UserInfoManager userInfoMgr;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRecordBasicInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void bindData$default(SportRecordBasicInfoView sportRecordBasicInfoView, SportBasicReport sportBasicReport, List list, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 16) != 0) {
            z2 = true;
        }
        sportRecordBasicInfoView.bindData(sportBasicReport, list, str, z, z2);
    }

    private final void initRecycler() {
        this.mDetailList = new ArrayList();
        this.recyclerSportInfo.setLayoutManager(new GridLayoutManager(getContext(), 3));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List<rz5> list = this.mDetailList;
        SportDetailAdapter sportDetailAdapter = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
            list = null;
        }
        this.mDetailAdapter = new SportDetailAdapter(context, list, ivi.B0, 3);
        if (pz9.a(getContext())) {
            SportDetailAdapter sportDetailAdapter2 = this.mDetailAdapter;
            if (sportDetailAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailAdapter");
                sportDetailAdapter2 = null;
            }
            sportDetailAdapter2.setItemPosition(1);
        } else {
            SportDetailAdapter sportDetailAdapter3 = this.mDetailAdapter;
            if (sportDetailAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailAdapter");
                sportDetailAdapter3 = null;
            }
            sportDetailAdapter3.setItemPosition(0);
        }
        this.recyclerSportInfo.addItemDecoration(new SportBasicInfoItemDecoration());
        RecyclerView recyclerView = this.recyclerSportInfo;
        SportDetailAdapter sportDetailAdapter4 = this.mDetailAdapter;
        if (sportDetailAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailAdapter");
        } else {
            sportDetailAdapter = sportDetailAdapter4;
        }
        recyclerView.setAdapter(sportDetailAdapter);
    }

    private final void setBasicInfo(BasicItemInfo basicInfo, TextView title, TextView value) {
        title.setVisibility(0);
        value.setVisibility(0);
        value.setText(basicInfo.getData());
    }

    public final void bindCourseName(@Nullable String courseName) {
        String string;
        TextView textView = this.binding.K;
        if (courseName == null || courseName.length() == 0) {
            string = ResourceExtKt.getString(j1j.f22328a);
        } else {
            string = ResourceExtKt.getString(j1j.f22328a) + " | " + courseName;
        }
        textView.setText(string);
    }

    public final void bindData(@NotNull SportBasicReport basicReport, @NotNull List<BasicItemInfo> dataList, @Nullable String sportName, boolean isCommonSport, boolean needUpdateCourseName) {
        String string;
        Integer correctedDistance;
        Intrinsics.checkNotNullParameter(basicReport, "basicReport");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.binding.M.setVisibility((basicReport.getCorrectedDistance() == null || (correctedDistance = basicReport.getCorrectedDistance()) == null || correctedDistance.intValue() <= 0) ? 8 : 0);
        if (basicReport.getSportType() == 17 || basicReport.getProtoType() == 25 || !FitnessSportTypeUtils.INSTANCE.supportGpsSport(basicReport) || AppUtil.INSTANCE.isPlayChannel()) {
            this.binding.J.setVisibility(8);
            this.binding.A.setVisibility(0);
        } else {
            this.binding.J.setVisibility(0);
            this.binding.A.setVisibility(8);
        }
        if (isCommonSport) {
            TextView sportTime = this.binding.L;
            Intrinsics.checkNotNullExpressionValue(sportTime, "sportTime");
            ViewExtKt.gone(sportTime);
        } else {
            TextView sportTime2 = this.binding.L;
            Intrinsics.checkNotNullExpressionValue(sportTime2, "sportTime");
            ViewExtKt.visible(sportTime2);
            this.binding.L.setText(TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat(basicReport.getStartTime(), true));
        }
        if (needUpdateCourseName) {
            if (isCommonSport) {
                this.binding.K.setText(ResourceExtKt.getString(j1j.f22328a));
            } else {
                this.binding.K.setText((sportName == null || sportName.length() == 0) ? ResourceExtKt.getString(j1j.f22328a) : ResourceExtKt.getString(j1j.f22328a) + " | " + sportName);
            }
        }
        if (!dataList.isEmpty()) {
            BasicItemInfo basicItemInfo = dataList.get(0);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (AppUtil.getTxtFontSize(context) >= 1.25f) {
                this.binding.F.setTextSize(40.0f);
            }
            this.binding.F.setText(basicItemInfo.getData());
            this.binding.P.setText(basicItemInfo.getUnit());
            if ((basicReport.getSportType() == 708 || basicReport.getSportType() == 709) && basicItemInfo.getTitle() == j1j.m7) {
                TextView mainValueDesTV = this.binding.E;
                Intrinsics.checkNotNullExpressionValue(mainValueDesTV, "mainValueDesTV");
                ViewExtKt.visible(mainValueDesTV);
                this.binding.E.setText("(" + ResourceExtKt.getString(basicItemInfo.getTitle()) + ")");
            } else if (basicReport.getProtoType() == 25) {
                TextView mainValueDesTV2 = this.binding.E;
                Intrinsics.checkNotNullExpressionValue(mainValueDesTV2, "mainValueDesTV");
                ViewExtKt.visible(mainValueDesTV2);
                this.binding.E.setText("(" + ResourceExtKt.getString(basicItemInfo.getTitle()) + ")");
            } else {
                TextView mainValueDesTV3 = this.binding.E;
                Intrinsics.checkNotNullExpressionValue(mainValueDesTV3, "mainValueDesTV");
                ViewExtKt.gone(mainValueDesTV3);
            }
            List<BasicItemInfo> listSubList = dataList.subList(1, dataList.size());
            List<rz5> list = this.mDetailList;
            SportDetailAdapter sportDetailAdapter = null;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
                list = null;
            }
            if (list.size() > 0) {
                List<rz5> list2 = this.mDetailList;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
                    list2 = null;
                }
                list2.clear();
            }
            for (BasicItemInfo basicItemInfo2 : listSubList) {
                rz5 rz5Var = new rz5();
                String pluralTitle = basicItemInfo2.getPluralTitle();
                if (pluralTitle == null || pluralTitle.length() == 0) {
                    string = getContext().getString(basicItemInfo2.getTitle());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                } else {
                    string = basicItemInfo2.getPluralTitle();
                }
                rz5Var.f33082b = string;
                rz5Var.c = basicItemInfo2.getUnit();
                rz5Var.d = basicItemInfo2.getData();
                String remindUrl = basicItemInfo2.getRemindUrl();
                if (remindUrl != null && remindUrl.length() != 0) {
                    rz5Var.h = basicItemInfo2.getRemindUrl();
                }
                int index = basicItemInfo2.getIndex();
                BasicItemInfo.Companion companion = BasicItemInfo.INSTANCE;
                if (index == companion.getSPORT_DATA_INFO_PACE()) {
                    rz5Var.g(1);
                } else if (index == companion.getSPORT_INFO_POSTURE()) {
                    rz5Var.g(2);
                } else {
                    rz5Var.g(0);
                }
                List<rz5> list3 = this.mDetailList;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
                    list3 = null;
                }
                list3.add(rz5Var);
            }
            SportDetailAdapter sportDetailAdapter2 = this.mDetailAdapter;
            if (sportDetailAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailAdapter");
            } else {
                sportDetailAdapter = sportDetailAdapter2;
            }
            sportDetailAdapter.notifyDataSetChanged();
        }
    }

    public final void cancelAvatarLoad() {
        Disposable disposable = this.avatarAddressLoadDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @NotNull
    public final UserInfoManager getUserInfoMgr() {
        return this.userInfoMgr;
    }

    public final void setUserInfoMgr(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.userInfoMgr = userInfoManager;
    }

    public final void updateHeaderInfo(@Nullable AccountCoreInfo accountCoreInfo, boolean isCommonSport) {
        RoundImageView header = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(header, "header");
        String avatarAddress = accountCoreInfo != null ? accountCoreInfo.getAvatarAddress() : null;
        ImageLoader imageLoader = Coil.imageLoader(header.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(header.getContext()).data(avatarAddress).target(header);
        builderTarget.allowHardware(false);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.placeholder(hoi.o);
        builderTarget.error(hoi.o);
        this.avatarAddressLoadDisposable = imageLoader.enqueue(builderTarget.build());
        this.binding.G.setText(accountCoreInfo != null ? accountCoreInfo.getUserName() : null);
        TextView textView = this.binding.F;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRecordBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportRecordBasicInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportRecordBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.userInfoMgr = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
        qod qodVarA0 = qod.A0(LayoutInflater.from(context), this, true);
        this.binding = qodVarA0;
        this.recyclerSportInfo = qodVarA0.H;
        initRecycler();
    }
}
