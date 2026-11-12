package com.xiaomi.fitness.homepage.viewholder;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.TalkbackLogger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.homepage.util.HealthDataUtil;
import com.xiaomi.fitness.homepage.viewholder.CommonContentViewHolder;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import defpackage.c0j;
import defpackage.km5;
import defpackage.lp5;
import defpackage.nf2;
import defpackage.oyi;
import defpackage.pni;
import defpackage.pz6;
import defpackage.q7e;
import defpackage.qxi;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 :2\u00020\u0001:\u0001:B\u0019\b\u0016\u0012\u0006\u00107\u001a\u00020-\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b8\u00109J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010(\u001a\u0004\b5\u0010*\"\u0004\b6\u0010,¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/homepage/viewholder/CommonContentViewHolder;", "Lnf2;", "Landroid/app/ActivityOptions;", "activityOptions", "", "onSportListClick", "(Landroid/app/ActivityOptions;)V", "Lkm5;", "dataModel", "onSportRecordClick", "(Lkm5;Landroid/app/ActivityOptions;)V", "initView", "()V", "Landroid/content/Context;", "context", "bindData", "(Landroid/content/Context;Lkm5;)V", "Landroid/content/Context;", "Lq7e;", "mBinding", "Lq7e;", "Landroid/widget/ImageView;", "imgType", "Landroid/widget/ImageView;", "getImgType", "()Landroid/widget/ImageView;", "setImgType", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "txtSportTypeName", "Landroid/widget/TextView;", "getTxtSportTypeName", "()Landroid/widget/TextView;", "setTxtSportTypeName", "(Landroid/widget/TextView;)V", "txtSportContent", "getTxtSportContent", "setTxtSportContent", "Landroid/widget/RelativeLayout;", "rlSportRecord", "Landroid/widget/RelativeLayout;", "getRlSportRecord", "()Landroid/widget/RelativeLayout;", "setRlSportRecord", "(Landroid/widget/RelativeLayout;)V", "Landroid/view/View;", "divider", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "setDivider", "(Landroid/view/View;)V", "rlRecordList", "getRlRecordList", "setRlRecordList", "itemView", "<init>", "(Landroid/view/View;Landroid/content/Context;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CommonContentViewHolder extends nf2 {

    @NotNull
    public static final String COMMA = ", ";

    @NotNull
    public static final String TAG = "CommonContentViewHolder";

    @NotNull
    private final Context context;
    public View divider;
    public ImageView imgType;

    @NotNull
    private q7e mBinding;
    public RelativeLayout rlRecordList;
    public RelativeLayout rlSportRecord;
    public TextView txtSportContent;
    public TextView txtSportTypeName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonContentViewHolder(@NotNull View itemView, @NotNull Context context) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBinding = q7e.A0(itemView);
        this.context = context;
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindData$lambda$0(CommonContentViewHolder this$0, ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSportListClick(activityOptions);
        HealthTabOneTrackExtKt.oneTrackOnHealthHeaderComponentClick(2, true);
        HealthTabOneTrackExtKt.oneTrackOnSportRecordEntranceClick(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindData$lambda$1(CommonContentViewHolder this$0, km5 dataModel, ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dataModel, "$dataModel");
        this$0.onSportRecordClick(dataModel, activityOptions);
        HealthTabOneTrackExtKt.oneTrackOnHealthHeaderComponentClick(1, true);
        HealthTabOneTrackExtKt.oneTrackOnSportRecordEntranceClick(2);
        return Unit.INSTANCE;
    }

    private final void onSportListClick(ActivityOptions activityOptions) {
        SportRecordApi.DefaultImpls.goSportRecordList$default(SportRecordApiKt.getSportRecordApi(), this.context, activityOptions, null, null, 12, null);
    }

    private final void onSportRecordClick(km5 dataModel, ActivityOptions activityOptions) {
        if (dataModel == null) {
            return;
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(dataModel.d)) {
            bundle.putString("did", dataModel.d);
            bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDate(dataModel.f23978a));
        }
        SportBasicReport sportBasicReport = dataModel.i;
        if (sportBasicReport != null) {
            bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
            bundle.putSerializable("sport_report", sportBasicReport);
            bundle.putInt("sport_type", dataModel.c);
            SportRecordApiKt.getSportRecordApi().goSportDetail(this.context, bundle, activityOptions, sportBasicReport);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    public final void bindData(@NotNull Context context, @NotNull final km5 dataModel) {
        String strC;
        String quantityString;
        String string;
        int i;
        int i2;
        StringBuffer stringBuffer;
        String string2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        getImgType().setImageResource(lp5.b(dataModel.c));
        SportBasicReport sportBasicReport = dataModel.i;
        if (sportBasicReport == null || (strC = sportBasicReport.getCourseName()) == null) {
            strC = lp5.c(dataModel.c);
        }
        if (sportBasicReport != null) {
            getDivider().setVisibility(0);
            getRlRecordList().setVisibility(0);
            getRlSportRecord().setBackgroundResource(pni.E2);
            if (sportBasicReport.getCalories() != null) {
                quantityString = context.getResources().getQuantityString(qxi.common_unit_calorie_desc, sportBasicReport.getCalories(), sportBasicReport.getCalories());
                string = ResourceExtKt.getString(c0j.Cq, quantityString);
            } else {
                quantityString = "";
                string = quantityString;
            }
            String zNTimeWithSec = TimeDateUtil.getZNTimeWithSec(sportBasicReport.getDuration());
            int i3 = c0j.Qq;
            Object[] objArr = new Object[1];
            objArr[0] = zNTimeWithSec != null ? zNTimeWithSec : "";
            String string3 = ResourceExtKt.getString(i3, objArr);
            if (sportBasicReport.getDistance() != null) {
                Integer distance = sportBasicReport.getDistance();
                Intrinsics.checkNotNull(distance);
                if (distance.intValue() > 0) {
                    Integer correctedDistance = sportBasicReport.getCorrectedDistance();
                    Integer distance2 = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportBasicReport.getDistance() : sportBasicReport.getCorrectedDistance();
                    Intrinsics.checkNotNull(distance2);
                    String strB = pz6.b(context, distance2.intValue());
                    string2 = context.getString(c0j.l5, strB, zNTimeWithSec, quantityString);
                    stringBuffer3.append(ResourceExtKt.getString(c0j.Pq, strB));
                    stringBuffer3.append(", ");
                    stringBuffer3.append(string3);
                    stringBuffer3.append(", ");
                    stringBuffer3.append(string);
                    stringBuffer3.append(", ");
                    stringBuffer = stringBuffer2;
                } else {
                    i = dataModel.c;
                    if ((i != 31 || i == 33) && sportBasicReport.getSportCount() > 0) {
                        int sportCount = sportBasicReport.getSportCount();
                        if (dataModel.c == 31) {
                            i2 = qxi.common_unit_time_rope_skipping_desc;
                        } else {
                            i2 = qxi.common_unit_time_rowing_desc;
                        }
                        stringBuffer = stringBuffer2;
                        String quantityString2 = context.getResources().getQuantityString(qxi.common_unit_time_rowing_desc, sportCount, Integer.valueOf(sportCount));
                        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                        String quantityString3 = context.getResources().getQuantityString(i2, sportCount, Integer.valueOf(sportCount));
                        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
                        string2 = context.getString(c0j.n5, quantityString3, zNTimeWithSec, quantityString);
                        stringBuffer3.append(quantityString2);
                        stringBuffer3.append(", ");
                        stringBuffer3.append(string3);
                        stringBuffer3.append(", ");
                        stringBuffer3.append(string);
                    } else {
                        stringBuffer = stringBuffer2;
                        int i4 = dataModel.c;
                        if (i4 == 186 || i4 == 188 || i4 == 187) {
                            Float maxDivingDepth = sportBasicReport.getMaxDivingDepth();
                            float fE = xr5.e(1, maxDivingDepth != null ? maxDivingDepth.floatValue() : 0.0f);
                            if (sportBasicReport.getTotalDivingDuration() != null) {
                                Integer totalDivingDuration = sportBasicReport.getTotalDivingDuration();
                                Intrinsics.checkNotNull(totalDivingDuration);
                                zNTimeWithSec = TimeDateUtil.getZNTimeWithSec(totalDivingDuration.intValue());
                            }
                            Resources resources = context.getResources();
                            int i5 = oyi.common_unit_meter_desc_new;
                            Float maxDivingDepth2 = sportBasicReport.getMaxDivingDepth();
                            String quantityString4 = resources.getQuantityString(i5, maxDivingDepth2 != null ? (int) maxDivingDepth2.floatValue() : 0, Float.valueOf(fE));
                            Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
                            string2 = context.getString(c0j.m5, quantityString4, zNTimeWithSec);
                            Unit unit = Unit.INSTANCE;
                        } else if (i4 == 812) {
                            Unit unit2 = Unit.INSTANCE;
                            string2 = strC;
                        } else {
                            string2 = context.getString(c0j.m5, zNTimeWithSec, quantityString);
                            stringBuffer3.append(string3);
                            stringBuffer3.append(", ");
                            stringBuffer3.append(string);
                            stringBuffer3.append(", ");
                        }
                    }
                }
            } else {
                i = dataModel.c;
                if (i != 31) {
                    int sportCount2 = sportBasicReport.getSportCount();
                    if (dataModel.c == 31) {
                        i2 = qxi.common_unit_time_rope_skipping_desc;
                    } else {
                        i2 = qxi.common_unit_time_rowing_desc;
                    }
                    stringBuffer = stringBuffer2;
                    String quantityString5 = context.getResources().getQuantityString(qxi.common_unit_time_rowing_desc, sportCount2, Integer.valueOf(sportCount2));
                    Intrinsics.checkNotNullExpressionValue(quantityString5, "getQuantityString(...)");
                    String quantityString6 = context.getResources().getQuantityString(i2, sportCount2, Integer.valueOf(sportCount2));
                    Intrinsics.checkNotNullExpressionValue(quantityString6, "getQuantityString(...)");
                    string2 = context.getString(c0j.n5, quantityString6, zNTimeWithSec, quantityString);
                    stringBuffer3.append(quantityString5);
                    stringBuffer3.append(", ");
                    stringBuffer3.append(string3);
                    stringBuffer3.append(", ");
                    stringBuffer3.append(string);
                } else {
                    int sportCount3 = sportBasicReport.getSportCount();
                    if (dataModel.c == 31) {
                        i2 = qxi.common_unit_time_rope_skipping_desc;
                    } else {
                        i2 = qxi.common_unit_time_rowing_desc;
                    }
                    stringBuffer = stringBuffer2;
                    String quantityString7 = context.getResources().getQuantityString(qxi.common_unit_time_rowing_desc, sportCount3, Integer.valueOf(sportCount3));
                    Intrinsics.checkNotNullExpressionValue(quantityString7, "getQuantityString(...)");
                    String quantityString8 = context.getResources().getQuantityString(i2, sportCount3, Integer.valueOf(sportCount3));
                    Intrinsics.checkNotNullExpressionValue(quantityString8, "getQuantityString(...)");
                    string2 = context.getString(c0j.n5, quantityString8, zNTimeWithSec, quantityString);
                    stringBuffer3.append(quantityString7);
                    stringBuffer3.append(", ");
                    stringBuffer3.append(string3);
                    stringBuffer3.append(", ");
                    stringBuffer3.append(string);
                }
            }
            getTxtSportTypeName().setText(string2);
            String string4 = context.getString(c0j.a7, strC, TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat(sportBasicReport.getStartTime(), true));
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            getTxtSportContent().setText(string4);
            stringBuffer2 = stringBuffer;
            stringBuffer2.append(string4);
            stringBuffer2.append(", ");
            stringBuffer2.append(stringBuffer3);
            HealthDataUtil healthDataUtil = HealthDataUtil.INSTANCE;
            healthDataUtil.cardZoom(context, getRlRecordList(), new Function1() { // from class: z54
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CommonContentViewHolder.bindData$lambda$0(this.f40893a, (ActivityOptions) obj);
                }
            });
            healthDataUtil.cardZoom(context, getRlSportRecord(), new Function1() { // from class: a64
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CommonContentViewHolder.bindData$lambda$1(this.f675a, dataModel, (ActivityOptions) obj);
                }
            });
            getRlRecordList().setTag(HealthTabOneTrackExtKt.buildHealthHeaderExposeTag(2, true));
            getRlSportRecord().setTag(HealthTabOneTrackExtKt.buildHealthHeaderExposeTag(1, true));
        } else {
            getRlSportRecord().setTag(HealthTabOneTrackExtKt.buildHealthHeaderExposeTag(1, false));
            getRlRecordList().setTag(null);
            getImgType().setImageResource(pni.C3);
            getTxtSportTypeName().setText(c0j.s7);
            getTxtSportContent().setText(c0j.W6);
            getDivider().setVisibility(8);
            getRlRecordList().setVisibility(8);
            stringBuffer2.append(ExtUtilKt.getString(c0j.s7));
            stringBuffer2.append(", ");
            stringBuffer2.append(ExtUtilKt.getString(c0j.W6));
        }
        TalkbackLogger.INSTANCE.d(TAG, "recent sport record / all sport records:  talkback=" + ((Object) stringBuffer2), new Object[0]);
        getRlSportRecord().setContentDescription(stringBuffer2.toString());
    }

    @NotNull
    public final View getDivider() {
        View view = this.divider;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("divider");
        return null;
    }

    @NotNull
    public final ImageView getImgType() {
        ImageView imageView = this.imgType;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imgType");
        return null;
    }

    @NotNull
    public final RelativeLayout getRlRecordList() {
        RelativeLayout relativeLayout = this.rlRecordList;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rlRecordList");
        return null;
    }

    @NotNull
    public final RelativeLayout getRlSportRecord() {
        RelativeLayout relativeLayout = this.rlSportRecord;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rlSportRecord");
        return null;
    }

    @NotNull
    public final TextView getTxtSportContent() {
        TextView textView = this.txtSportContent;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtSportContent");
        return null;
    }

    @NotNull
    public final TextView getTxtSportTypeName() {
        TextView textView = this.txtSportTypeName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtSportTypeName");
        return null;
    }

    public final void initView() {
        setImgType(this.mBinding.B);
        setTxtSportTypeName(this.mBinding.H);
        setTxtSportContent(this.mBinding.F);
        setRlSportRecord(this.mBinding.C);
        setDivider(this.mBinding.E);
        setRlRecordList(this.mBinding.D);
        getImgType().setImageResource(pni.C3);
        getRlSportRecord().setBackgroundResource(pni.D2);
    }

    public final void setDivider(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.divider = view;
    }

    public final void setImgType(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgType = imageView;
    }

    public final void setRlRecordList(@NotNull RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.rlRecordList = relativeLayout;
    }

    public final void setRlSportRecord(@NotNull RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.rlSportRecord = relativeLayout;
    }

    public final void setTxtSportContent(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtSportContent = textView;
    }

    public final void setTxtSportTypeName(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtSportTypeName = textView;
    }
}
