package com.xiaomi.fitness.electronic.scale;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.github.chrisbanes.photoview.PhotoView;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.DataReportActivity;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.model.DataReportBean;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import com.xiaomi.fitness.electronic.scale.widget.BodyCompositionAnalysisView;
import com.xiaomi.fitness.electronic.scale.widget.BodyIndexScoreView;
import com.xiaomi.fitness.electronic.scale.widget.EvaluationIndexView;
import defpackage.av1;
import defpackage.bg4;
import defpackage.bri;
import defpackage.bu7;
import defpackage.eji;
import defpackage.f4b;
import defpackage.gui;
import defpackage.km9;
import defpackage.o4h;
import defpackage.qal;
import defpackage.rrr;
import defpackage.tj0;
import defpackage.wc0;
import defpackage.zzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_DATA_REPORT_ACTIVITY)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0007¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/DataReportActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/DataReportViewModel;", "Ltj0;", "", "initView", "()V", "goDownloadActivity", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "it", "initBaseInfo", "(Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;)V", "", "sex", "age", "height", "initVisitorBaseInfo", "(Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;III)V", "saveGallery", "generatePicture", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/electronic/scale/model/DataReportBean;", "dataReportBean", "Lcom/xiaomi/fitness/electronic/scale/model/DataReportBean;", "getDataReportBean", "()Lcom/xiaomi/fitness/electronic/scale/model/DataReportBean;", "setDataReportBean", "(Lcom/xiaomi/fitness/electronic/scale/model/DataReportBean;)V", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "getVirtualAccount", "()Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "setVirtualAccount", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "", "isMainUser", "Z", "()Z", "setMainUser", "(Z)V", "isPic", "setPic", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DataReportActivity extends Hilt_DataReportActivity<DataReportViewModel, tj0> {

    @NotNull
    public static final String KEY_BODY_AGE = "key_body_result_age";

    @NotNull
    public static final String KEY_BODY_HEIGHT = "key_body_result_height";

    @NotNull
    public static final String KEY_BODY_IS_MAIN_USER = "key_body_main_user";

    @NotNull
    public static final String KEY_BODY_RESULT = "key_body_result";

    @NotNull
    public static final String KEY_BODY_SEX = "key_body_result_sex";

    @Nullable
    private DataReportBean dataReportBean;
    private boolean isMainUser;
    private volatile boolean isPic;

    @Nullable
    private VirtualAccount virtualAccount;

    @NotNull
    private final String TAG = "DataReportActivity";

    @NotNull
    private final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: en5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DataReportActivity.onClickListener$lambda$10(this.f16834a, view);
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    private final void generatePicture() {
        if (this.isPic) {
            return;
        }
        this.isPic = true;
        ((tj0) getMBinding()).V.postDelayed(new Runnable() { // from class: ln5
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                DataReportActivity.generatePicture$lambda$11(this.f25237a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void generatePicture$lambda$11(DataReportActivity this$0) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFinishing()) {
            return;
        }
        Bitmap bitmapA = km9.a(((tj0) this$0.getMBinding()).V);
        String strE = km9.e(this$0, bitmapA, km9.b(this$0));
        Intrinsics.checkNotNull(strE);
        this$0.dataReportBean = new DataReportBean(bitmapA, strE);
        ((tj0) this$0.getMBinding()).A.setVisibility(4);
        ((tj0) this$0.getMBinding()).G.setVisibility(0);
        PhotoView photoView = ((tj0) this$0.getMBinding()).G;
        DataReportBean dataReportBean = this$0.dataReportBean;
        photoView.setImageBitmap(dataReportBean != null ? dataReportBean.getImgBitmap() : null);
    }

    private final void goDownloadActivity() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        Uri uri = Uri.parse("https://watch.iot.mi.com/download-apps-v3.html?redir=mifitness&region=cn");
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        intent.setData(uri);
        startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBaseInfo(WeightResult it) {
        String string;
        String string2;
        String str;
        tj0 tj0Var = (tj0) getMBinding();
        ((DataReportViewModel) getMViewModel()).initUserProfile();
        String string3 = getResources().getString(zzi.L4);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        TextView textView = tj0Var.K;
        VirtualAccount virtualAccount = this.virtualAccount;
        textView.setText(string3 + ":" + (virtualAccount != null ? virtualAccount.getName() : null));
        UserProfile profile = ((DataReportViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile);
        String str2 = "";
        if (StringsKt__StringsJVMKt.equals$default(profile.getSex(), "female", false, 2, null)) {
            string = getString(zzi.d1);
        } else {
            UserProfile profile2 = ((DataReportViewModel) getMViewModel()).getProfile();
            Intrinsics.checkNotNull(profile2);
            string = StringsKt__StringsJVMKt.equals$default(profile2.getSex(), "male", false, 2, null) ? getString(zzi.R3) : "";
        }
        String string4 = getResources().getString(zzi.N4);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        tj0Var.N.setText(string4 + ":" + string);
        UserProfile profile3 = ((DataReportViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile3);
        int age = profile3.getAge();
        UserProfile profile4 = ((DataReportViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile4);
        String birth = profile4.getBirth();
        if (birth == null || birth.length() == 0 || age == 0) {
            string2 = "";
        } else {
            string2 = getResources().getString(zzi.o5, String.valueOf(age));
            qal.c("initBaseInfo() ageString is " + string2 + " , age is " + age);
        }
        String string5 = getResources().getString(zzi.J4);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        tj0Var.H.setText(string5 + ":" + string2);
        UserProfile profile5 = ((DataReportViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile5);
        if (((int) profile5.getHeight()) != 0) {
            String string6 = getString(zzi.p5);
            UserProfile profile6 = ((DataReportViewModel) getMViewModel()).getProfile();
            Intrinsics.checkNotNull(profile6);
            String strValueOf = String.valueOf((int) profile6.getHeight());
            str = string6;
            str2 = strValueOf;
        } else {
            str = "";
        }
        String string7 = getResources().getString(zzi.K4);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        tj0Var.J.setText(string7 + ":" + str2 + str);
        String string8 = getResources().getString(zzi.M4);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        String dateToString = DateUtil.INSTANCE.getDateToString(System.currentTimeMillis(), "yyyy-MM-dd");
        tj0Var.L.setText(string8 + ":" + dateToString);
        BodyIndexScoreView bodyIndexScoreView = tj0Var.R;
        UserProfile profile7 = ((DataReportViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile7);
        String sex = profile7.getSex();
        UserProfile profile8 = ((DataReportViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile8);
        bodyIndexScoreView.initData(it, sex, age, profile8.getHeight());
        BodyCompositionAnalysisView bodyCompositionAnalysisView = tj0Var.Q;
        UserProfile profile9 = ((DataReportViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile9);
        String sex2 = profile9.getSex();
        UserProfile profile10 = ((DataReportViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile10);
        bodyCompositionAnalysisView.initData(it, sex2, age, profile10.getHeight());
        EvaluationIndexView evaluationIndexView = tj0Var.T;
        UserProfile profile11 = ((DataReportViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile11);
        evaluationIndexView.initData(it, profile11.getSex());
        tj0Var.U.initData(it);
        tj0Var.W.initData(it);
        tj0Var.setOnClick(this.onClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.U0));
        }
        setTitleBackground(eji.s);
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        this.virtualAccount = (VirtualAccount) getIntent().getSerializableExtra(KEY_BODY_RESULT);
        this.isMainUser = getIntent().getBooleanExtra(KEY_BODY_IS_MAIN_USER, false);
        if (this.virtualAccount == null) {
            ((DataReportViewModel) getMViewModel()).getReportData(new Function1() { // from class: jn5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DataReportActivity.initView$lambda$1(this.f22939a, (List) obj);
                }
            });
        } else {
            LiveData weightResult = ((DataReportViewModel) getMViewModel()).getWeightResult();
            VirtualAccount virtualAccount = this.virtualAccount;
            weightResult.setValue(bu7.a(virtualAccount != null ? virtualAccount.getBodyComposition() : null, WeightResult.class));
            int intExtra = getIntent().getIntExtra(KEY_BODY_SEX, 0);
            int intExtra2 = getIntent().getIntExtra(KEY_BODY_AGE, 0);
            int intExtra3 = getIntent().getIntExtra(KEY_BODY_HEIGHT, 0);
            Logger.i("handleWeight DataReportActivity:" + f4b.c(this.virtualAccount), new Object[0]);
            WeightResult value = ((DataReportViewModel) getMViewModel()).getWeightResult().getValue();
            if (value != null) {
                initVisitorBaseInfo(value, intExtra, intExtra2, intExtra3);
                Logger.i("handle weight VisitorMeasure sex : " + intExtra, new Object[0]);
                Logger.i("handle weight VisitorMeasure age : " + intExtra2, new Object[0]);
                Logger.i("handle weight VisitorMeasure height : " + intExtra3, new Object[0]);
            }
            generatePicture();
        }
        ((tj0) getMBinding()).G.setOnLongClickListener(new View.OnLongClickListener() { // from class: kn5
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return DataReportActivity.initView$lambda$3(this.f24017a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$1(DataReportActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "list");
        if (!list.isEmpty()) {
            this$0.virtualAccount = (VirtualAccount) list.get(0);
            LiveData weightResult = ((DataReportViewModel) this$0.getMViewModel()).getWeightResult();
            VirtualAccount virtualAccount = this$0.virtualAccount;
            weightResult.setValue(bu7.a(virtualAccount != null ? virtualAccount.getBodyComposition() : null, WeightResult.class));
            WeightResult value = ((DataReportViewModel) this$0.getMViewModel()).getWeightResult().getValue();
            if (value != null) {
                this$0.initBaseInfo(value);
            }
            VirtualAccount virtualAccount2 = this$0.virtualAccount;
            qal.c("initView() : " + f4b.c(virtualAccount2 != null ? virtualAccount2.getBodyComposition() : null));
            this$0.generatePicture();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$3(DataReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goDownloadActivity();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initVisitorBaseInfo(WeightResult it, int sex, int age, int height) {
        final tj0 tj0Var = (tj0) getMBinding();
        ((DataReportViewModel) getMViewModel()).initUserProfile();
        String string = sex == 0 ? getString(zzi.d1) : getString(zzi.R3);
        Intrinsics.checkNotNull(string);
        String string2 = getResources().getString(zzi.N4);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        tj0Var.N.setText(string2 + ":" + string);
        String string3 = getResources().getString(zzi.o5, String.valueOf(age));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getResources().getString(zzi.J4);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        tj0Var.H.setText(string4 + ":" + string3);
        String string5 = getString(zzi.p5);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = getResources().getString(zzi.K4);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        tj0Var.J.setText(string6 + ":" + height + string5);
        String string7 = getResources().getString(zzi.M4);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String dateToString = DateUtil.INSTANCE.getDateToString(it.getTime(), "yyyy-MM-dd");
        tj0Var.L.setText(string7 + ":" + dateToString);
        String str = sex == 0 ? "female" : "male";
        float f = height;
        tj0Var.R.initData(it, str, age, f);
        tj0Var.Q.initData(it, str, age, f);
        tj0Var.T.initData(it, str);
        tj0Var.U.initData(it);
        tj0Var.W.initData(it);
        tj0Var.setOnClick(this.onClickListener);
        final String string8 = getResources().getString(zzi.L4);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        if (this.isMainUser) {
            o4h<rrr.a> o4hVarB = rrr.b(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
            final Function1 function1 = new Function1() { // from class: fn5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DataReportActivity.initVisitorBaseInfo$lambda$9$lambda$5(tj0Var, string8, this, (rrr.a) obj);
                }
            };
            bg4<? super rrr.a> bg4Var = new bg4() { // from class: gn5
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    DataReportActivity.initVisitorBaseInfo$lambda$9$lambda$6(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: hn5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DataReportActivity.initVisitorBaseInfo$lambda$9$lambda$7(tj0Var, string8, this, (Throwable) obj);
                }
            };
            o4hVarB.O(bg4Var, new bg4() { // from class: in5
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    DataReportActivity.initVisitorBaseInfo$lambda$9$lambda$8(function2, obj);
                }
            });
            return;
        }
        TextView textView = tj0Var.K;
        VirtualAccount virtualAccount = this.virtualAccount;
        textView.setText(string8 + ":" + (virtualAccount != null ? virtualAccount.getName() : null));
        generatePicture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVisitorBaseInfo$lambda$9$lambda$5(tj0 this_with, String tipsId, DataReportActivity this$0, rrr.a aVar) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(tipsId, "$tipsId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.K.setText(tipsId + ":" + (aVar != null ? aVar.f32838b : null));
        this$0.generatePicture();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initVisitorBaseInfo$lambda$9$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVisitorBaseInfo$lambda$9$lambda$7(tj0 this_with, String tipsId, DataReportActivity this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(tipsId, "$tipsId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.K.setText(tipsId + ":" + AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        Logger.e(this$0.TAG, "getProfileError : " + th);
        this$0.generatePicture();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initVisitorBaseInfo$lambda$9$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$10(DataReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int id = view.getId();
        if (id == bri.k1) {
            this$0.saveGallery();
        } else if (id == bri.A4) {
            this$0.saveGallery();
        }
    }

    private final void saveGallery() {
        Logger.i("saveGallery() dataReportBean :  " + this.dataReportBean, new Object[0]);
        DataReportBean dataReportBean = this.dataReportBean;
        Logger.i("saveGallery() imgBitmap :  " + (dataReportBean != null ? dataReportBean.getImgBitmap() : null), new Object[0]);
        DataReportBean dataReportBean2 = this.dataReportBean;
        if (dataReportBean2 != null) {
            if ((dataReportBean2 != null ? dataReportBean2.getImgBitmap() : null) == null) {
                return;
            }
            DataReportBean dataReportBean3 = this.dataReportBean;
            Intrinsics.checkNotNull(dataReportBean3);
            ShareUtil.saveImageToGallery$default(this, dataReportBean3.getImgBitmap(), LifecycleOwnerKt.getLifecycleScope(this), false, false, 24, null);
        }
    }

    @Nullable
    public final DataReportBean getDataReportBean() {
        return this.dataReportBean;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.i;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Nullable
    public final VirtualAccount getVirtualAccount() {
        return this.virtualAccount;
    }

    /* JADX INFO: renamed from: isMainUser, reason: from getter */
    public final boolean getIsMainUser() {
        return this.isMainUser;
    }

    /* JADX INFO: renamed from: isPic, reason: from getter */
    public final boolean getIsPic() {
        return this.isPic;
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_DataReportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_DataReportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Bitmap imgBitmap;
        Bitmap imgBitmap2;
        super.onDestroy();
        DataReportBean dataReportBean = this.dataReportBean;
        if (dataReportBean != null) {
            Boolean boolValueOf = (dataReportBean == null || (imgBitmap2 = dataReportBean.getImgBitmap()) == null) ? null : Boolean.valueOf(imgBitmap2.isRecycled());
            Intrinsics.checkNotNull(boolValueOf);
            if (boolValueOf.booleanValue()) {
                return;
            }
            DataReportBean dataReportBean2 = this.dataReportBean;
            if (dataReportBean2 != null && (imgBitmap = dataReportBean2.getImgBitmap()) != null) {
                imgBitmap.recycle();
            }
            DataReportBean dataReportBean3 = this.dataReportBean;
            if (dataReportBean3 != null) {
                dataReportBean3.setImgBitmap(null);
            }
        }
    }

    public final void setDataReportBean(@Nullable DataReportBean dataReportBean) {
        this.dataReportBean = dataReportBean;
    }

    public final void setMainUser(boolean z) {
        this.isMainUser = z;
    }

    public final void setPic(boolean z) {
        this.isPic = z;
    }

    public final void setVirtualAccount(@Nullable VirtualAccount virtualAccount) {
        this.virtualAccount = virtualAccount;
    }
}
