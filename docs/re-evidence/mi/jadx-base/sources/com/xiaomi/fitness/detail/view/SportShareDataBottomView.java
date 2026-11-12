package com.xiaomi.fitness.detail.view;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.share.report.adapter.ShareAdapterUtil;
import com.xiaomi.fitness.share.view.ShareRoutineView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.kod;
import defpackage.o5o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010/\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J+\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportShareDataBottomView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "dataInfoList", "", "chartType", "", "showAlgoSource", "", "bingData", "(Ljava/util/List;IZ)V", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountCoreInfo", "isCommonSport", "updateHeaderInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;Z)V", "", "str", "updateSportNameStr", "(Ljava/lang/String;)V", "initChartDataList", "()I", "updateDataView", "(Ljava/util/List;)V", "updateChartLineType", "(I)V", "Lkod;", "binding", "Lkod;", "Landroid/widget/TextView;", "mainValueTxtView", "Landroid/widget/TextView;", "unitTextView", "dataValueTxtView", "dataTitleTxtView", "dataUnitTxtView", "Lcom/xiaomi/fitness/detail/view/ShareTrackLineView;", "shareLineView", "Lcom/xiaomi/fitness/detail/view/ShareTrackLineView;", "Lcom/xiaomi/fitness/share/view/ShareRoutineView;", "routeView", "Lcom/xiaomi/fitness/share/view/ShareRoutineView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportShareDataBottomView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportShareDataBottomView.kt\ncom/xiaomi/fitness/detail/view/SportShareDataBottomView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,132:1\n54#2,3:133\n24#2:136\n59#2,6:137\n*S KotlinDebug\n*F\n+ 1 SportShareDataBottomView.kt\ncom/xiaomi/fitness/detail/view/SportShareDataBottomView\n*L\n74#1:133,3\n74#1:136\n74#1:137,6\n*E\n"})
public final class SportShareDataBottomView extends ConstraintLayout {

    @NotNull
    private final kod binding;

    @NotNull
    private final TextView dataTitleTxtView;

    @NotNull
    private final TextView dataUnitTxtView;

    @NotNull
    private final TextView dataValueTxtView;

    @NotNull
    private final TextView mainValueTxtView;

    @NotNull
    private final ShareRoutineView routeView;

    @NotNull
    private final ShareTrackLineView shareLineView;

    @NotNull
    private final TextView unitTextView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareDataBottomView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bingData(@NotNull List<BasicItemInfo> dataInfoList, int chartType, boolean showAlgoSource) {
        Intrinsics.checkNotNullParameter(dataInfoList, "dataInfoList");
        updateDataView(dataInfoList);
        List<Location> listB = o5o.e().b();
        List<Location> list = listB;
        if (list != null && !list.isEmpty() && this.routeView.getPath() == null) {
            Path path = new Path();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Location location = listB.get(i);
                if (i == 0) {
                    path.moveTo((float) location.longitude, (float) location.latitude);
                } else {
                    path.lineTo((float) location.longitude, (float) location.latitude);
                }
            }
            this.routeView.setPath(path);
            this.shareLineView.setVisibility(8);
            this.routeView.setVisibility(0);
        }
        updateChartLineType(chartType);
        if (showAlgoSource) {
            this.binding.J.setVisibility(0);
            TextView textView = this.binding.J;
            ShareAdapterUtil shareAdapterUtil = ShareAdapterUtil.INSTANCE;
            Application context = shareAdapterUtil.getContext();
            String string = shareAdapterUtil.getContext().getString(j1j.D2);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = shareAdapterUtil.getContext().getString(j1j.E2);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            textView.setText(shareAdapterUtil.insertIconInText(context, string, string2, hoi.b2));
        }
    }

    public final int initChartDataList() {
        List<SportRecordItem> listI;
        List<Location> listB = o5o.e().b();
        if (listB != null && (!listB.isEmpty())) {
            return 0;
        }
        List<SportRecordItem> listG = o5o.e().g();
        if (listG != null && (!listG.isEmpty())) {
            return 1;
        }
        List<SportRecordItem> listF = o5o.e().f();
        if ((listF != null && (!listF.isEmpty())) || ((listI = o5o.e().i()) != null && (!listI.isEmpty()))) {
            return 3;
        }
        List<SportRecordItem> listH = o5o.e().h();
        if (listH != null && (!listH.isEmpty())) {
            return 2;
        }
        List<SportRecordItem> listD = o5o.e().d();
        return (listD == null || !(listD.isEmpty() ^ true)) ? 1 : 4;
    }

    public final void updateChartLineType(int chartType) {
        if (chartType != 0) {
            this.shareLineView.setData(chartType);
            this.shareLineView.setVisibility(0);
            this.routeView.setVisibility(8);
            return;
        }
        this.shareLineView.setVisibility(4);
        List<Location> listB = o5o.e().b();
        if (listB == null || listB.isEmpty()) {
            this.routeView.setVisibility(8);
        } else {
            this.routeView.setVisibility(0);
        }
    }

    public final void updateDataView(@NotNull List<BasicItemInfo> dataInfoList) {
        String string;
        Intrinsics.checkNotNullParameter(dataInfoList, "dataInfoList");
        BasicItemInfo basicItemInfo = dataInfoList.get(0);
        this.mainValueTxtView.setText(basicItemInfo.getData());
        this.unitTextView.setText(basicItemInfo.getUnit());
        if (dataInfoList.size() == 2 || dataInfoList.size() == 3) {
            BasicItemInfo basicItemInfo2 = dataInfoList.get(1);
            this.dataValueTxtView.setText(basicItemInfo2.getData());
            this.dataUnitTxtView.setText(basicItemInfo2.getUnit());
            TextView textView = this.dataTitleTxtView;
            String pluralTitle = basicItemInfo2.getPluralTitle();
            if (pluralTitle == null || pluralTitle.length() == 0) {
                string = AppUtil.getApp().getString(basicItemInfo2.getTitle());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = basicItemInfo2.getPluralTitle();
            }
            textView.setText(string);
        }
    }

    public final void updateHeaderInfo(@Nullable AccountCoreInfo accountCoreInfo, boolean isCommonSport) {
        RoundImageView header = this.binding.E;
        Intrinsics.checkNotNullExpressionValue(header, "header");
        String avatarAddress = accountCoreInfo != null ? accountCoreInfo.getAvatarAddress() : null;
        ImageLoader imageLoader = Coil.imageLoader(header.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(header.getContext()).data(avatarAddress).target(header);
        builderTarget.allowHardware(false);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.placeholder(hoi.o);
        builderTarget.error(hoi.o);
        imageLoader.enqueue(builderTarget.build());
        this.binding.G.setText(accountCoreInfo != null ? accountCoreInfo.getUserName() : null);
    }

    public final void updateSportNameStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        this.binding.K.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareDataBottomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportShareDataBottomView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareDataBottomView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        kod kodVarA0 = kod.A0(LayoutInflater.from(context), this, true);
        this.binding = kodVarA0;
        this.mainValueTxtView = kodVarA0.F;
        this.unitTextView = kodVarA0.L;
        this.dataValueTxtView = kodVarA0.A;
        this.dataTitleTxtView = kodVarA0.B;
        this.dataUnitTxtView = kodVarA0.C;
        this.shareLineView = kodVarA0.I;
        this.routeView = kodVarA0.H;
    }
}
