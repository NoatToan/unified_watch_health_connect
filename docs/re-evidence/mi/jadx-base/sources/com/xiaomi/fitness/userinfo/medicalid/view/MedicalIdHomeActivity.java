package com.xiaomi.fitness.userinfo.medicalid.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LiveData;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.privacy.export.IPrivacySensitive;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRecord;
import com.xiaomi.fitness.userinfo.medicalid.baseui.DisplayItemView;
import com.xiaomi.fitness.userinfo.medicalid.util.BloodTypeConverter;
import com.xiaomi.fitness.userinfo.medicalid.util.ChannelAndRegionExtKt;
import com.xiaomi.fitness.userinfo.medicalid.util.DonorTypeConverter;
import com.xiaomi.fitness.userinfo.medicalid.util.GenderTypeConverter;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdHomeActivity;
import com.xiaomi.fitness.userinfo.medicalid.viewmodel.MedicalIdViewModel;
import com.xiaomi.fitness.userinfo.utils.StringFieldConverter;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.a4i;
import defpackage.av6;
import defpackage.dkq;
import defpackage.fyi;
import defpackage.hki;
import defpackage.hsi;
import defpackage.moi;
import defpackage.nuf;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.swi;
import defpackage.yo2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b{\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0006J\u0019\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0013R$\u0010%\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010\u0013R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010=\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010G\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010BR$\u0010K\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010B\u001a\u0004\bL\u0010D\"\u0004\bM\u0010FR\"\u0010N\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00101\u001a\u0004\bO\u00103\"\u0004\bP\u00105R$\u0010Q\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010D\"\u0004\bS\u0010FR$\u0010U\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010[\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010B\u001a\u0004\b\\\u0010D\"\u0004\b]\u0010FR$\u0010^\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u00108\u001a\u0004\b_\u0010:\"\u0004\b`\u0010<R$\u0010a\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u00108\u001a\u0004\bb\u0010:\"\u0004\bc\u0010<R$\u0010e\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR*\u0010m\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082D¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010w¨\u0006|"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/view/MedicalIdHomeActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/medicalid/viewmodel/MedicalIdViewModel;", "Ldkq;", "", "adaptNavigationBar", "()V", "findViews", "checkPrivacySensitiveDialogIfNeed", "loadData", "", "lockScreenStatus", "updateLockScreenShowDescriptionView", "(I)V", "initToolBar", "refreshView", "Landroid/view/View;", "view", "showPopupMenu", "(Landroid/view/View;)V", "gotoEditPage", "showDeleteDialogIfNeed", "deleteRecord", "refreshDetailView", "refreshEmergencyContact", "refreshMedicalIdInfo", "refreshUserInfo", "refreshAvatar", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "guideView", "Landroid/view/View;", "getGuideView", "()Landroid/view/View;", "setGuideView", "displayView", "getDisplayView", "setDisplayView", "Landroid/view/MenuItem;", "mMenuItem", "Landroid/view/MenuItem;", "getMMenuItem", "()Landroid/view/MenuItem;", "setMMenuItem", "(Landroid/view/MenuItem;)V", "", "mInitStatus", "Z", "getMInitStatus", "()Z", "setMInitStatus", "(Z)V", "Landroid/widget/TextView;", "tvName", "Landroid/widget/TextView;", "getTvName", "()Landroid/widget/TextView;", "setTvName", "(Landroid/widget/TextView;)V", "tvGenderAndAgeTextView", "getTvGenderAndAgeTextView", "setTvGenderAndAgeTextView", "Lcom/xiaomi/fitness/userinfo/medicalid/baseui/DisplayItemView;", "bloodTypeView", "Lcom/xiaomi/fitness/userinfo/medicalid/baseui/DisplayItemView;", "getBloodTypeView", "()Lcom/xiaomi/fitness/userinfo/medicalid/baseui/DisplayItemView;", "setBloodTypeView", "(Lcom/xiaomi/fitness/userinfo/medicalid/baseui/DisplayItemView;)V", "donorTypeView", "getDonorTypeView", "setDonorTypeView", "allergyView", "chronicView", "getChronicView", "setChronicView", "originatesFromEmergencyEntrance", "getOriginatesFromEmergencyEntrance", "setOriginatesFromEmergencyEntrance", "treatmentView", "getTreatmentView", "setTreatmentView", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "avatarImageView", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "getAvatarImageView", "()Lcom/xiaomi/fitness/widget/view/RoundImageView;", "setAvatarImageView", "(Lcom/xiaomi/fitness/widget/view/RoundImageView;)V", "emergencyContactView", "getEmergencyContactView", "setEmergencyContactView", "lockScreenDescriptionTv", "getLockScreenDescriptionTv", "setLockScreenDescriptionTv", "lockScreenSolveTv", "getLockScreenSolveTv", "setLockScreenSolveTv", "Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "mMedicalIdRecord", "Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "getMMedicalIdRecord", "()Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "setMMedicalIdRecord", "(Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "menuDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getMenuDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setMenuDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "", "TAG", "Ljava/lang/String;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MedicalIdHomeActivity extends Hilt_MedicalIdHomeActivity<MedicalIdViewModel, dkq> {

    @Nullable
    private DisplayItemView allergyView;

    @Nullable
    private RoundImageView avatarImageView;

    @Nullable
    private DisplayItemView bloodTypeView;

    @Nullable
    private DisplayItemView chronicView;

    @Nullable
    private View displayView;

    @Nullable
    private DisplayItemView donorTypeView;

    @Nullable
    private DisplayItemView emergencyContactView;

    @Nullable
    private View guideView;

    @Nullable
    private TextView lockScreenDescriptionTv;

    @Nullable
    private TextView lockScreenSolveTv;

    @Nullable
    private MedicalIdRecord mMedicalIdRecord;

    @Nullable
    private MenuItem mMenuItem;

    @Nullable
    private CommonDialog<DialogParams> menuDialog;
    private boolean originatesFromEmergencyEntrance;

    @Nullable
    private DisplayItemView treatmentView;

    @Nullable
    private TextView tvGenderAndAgeTextView;

    @Nullable
    private TextView tvName;
    private boolean mInitStatus = true;

    @NotNull
    private final String TAG = "MedicalIdHomeActivity";

    private final void adaptNavigationBar() {
        UIUtils.INSTANCE.setNavigationBarColor(this, hki.e);
    }

    private final void checkPrivacySensitiveDialogIfNeed() {
        PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        privacyHelperPointKt.showPrivacySensitiveDialogIfNeed(this, new IPrivacySensitive() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdHomeActivity.checkPrivacySensitiveDialogIfNeed.1
            @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitive
            public void onPrivacyAccepted() {
                MedicalIdHomeActivity.this.gotoEditPage();
            }

            @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitive
            public void onPrivacyDenied() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void deleteRecord() {
        ((MedicalIdViewModel) getMViewModel()).deleteRecord();
        ((MedicalIdViewModel) getMViewModel()).deletePersistentAvatarFile();
        ((MedicalIdViewModel) getMViewModel()).setFirstInitStatus(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void findViews() {
        CardView cardAidRecord = ((dkq) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(cardAidRecord, "cardAidRecord");
        View viewFindViewById = cardAidRecord.findViewById(hsi.d);
        this.guideView = viewFindViewById;
        TextView textView = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(hsi.A1) : null;
        Intrinsics.checkNotNull(textView, "null cannot be cast to non-null type android.view.View");
        nuf.f(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: inf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedicalIdHomeActivity.findViews$lambda$0(this.f21320a, view);
            }
        });
        View viewFindViewById2 = cardAidRecord.findViewById(hsi.c);
        this.displayView = viewFindViewById2;
        Intrinsics.checkNotNull(viewFindViewById2);
        this.tvName = (TextView) viewFindViewById2.findViewById(hsi.z1);
        View view = this.displayView;
        Intrinsics.checkNotNull(view);
        this.tvGenderAndAgeTextView = (TextView) view.findViewById(hsi.u1);
        this.bloodTypeView = ((dkq) getMBinding()).C.A.B;
        this.donorTypeView = ((dkq) getMBinding()).C.A.F;
        this.allergyView = ((dkq) getMBinding()).C.A.A;
        this.chronicView = ((dkq) getMBinding()).C.A.C;
        this.treatmentView = ((dkq) getMBinding()).C.A.H;
        View view2 = this.displayView;
        Intrinsics.checkNotNull(view2);
        this.avatarImageView = (RoundImageView) view2.findViewById(hsi.N);
        this.emergencyContactView = ((dkq) getMBinding()).C.A.D;
        this.lockScreenDescriptionTv = ((dkq) getMBinding()).F;
        this.lockScreenSolveTv = ((dkq) getMBinding()).G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findViews$lambda$0(MedicalIdHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkPrivacySensitiveDialogIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotoEditPage() {
        startActivity(new Intent(this, (Class<?>) MedicalIdEditActivity.class));
    }

    private final void initToolBar() {
        setActionBarDisplayable(false);
        View viewFindViewById = findViewById(hsi.o1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final Toolbar toolbar = (Toolbar) viewFindViewById;
        toolbar.setNavigationIcon(moi.f27050a);
        toolbar.setTitle("");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: fnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedicalIdHomeActivity.initToolBar$lambda$5(this.f17955a, view);
            }
        });
        toolbar.x(swi.c);
        toolbar.setOnMenuItemClickListener(new Toolbar.e() { // from class: gnf
            @Override // androidx.appcompat.widget.Toolbar.e
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MedicalIdHomeActivity.initToolBar$lambda$6(toolbar, this, menuItem);
            }
        });
        this.mMenuItem = toolbar.getMenu().findItem(hsi.q0);
        toolbar.findViewById(hsi.q0).setContentDescription(getString(o1j.Y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolBar$lambda$5(MedicalIdHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initToolBar$lambda$6(Toolbar toolbar, MedicalIdHomeActivity this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(toolbar, "$toolbar");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int itemId = menuItem.getItemId();
        int i = hsi.q0;
        if (itemId != i) {
            return false;
        }
        View viewFindViewById = toolbar.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this$0.showPopupMenu((ActionMenuItemView) viewFindViewById);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadData() {
        LiveData<Boolean> booleanLiveDataFromSP = ((MedicalIdViewModel) getMViewModel()).getBooleanLiveDataFromSP(MedicalIdSPContract.PREF_FIRST, true);
        if (booleanLiveDataFromSP != null) {
            booleanLiveDataFromSP.observe(this, new MedicalIdHomeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jnf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedicalIdHomeActivity.loadData$lambda$1(this.f22947a, (Boolean) obj);
                }
            }));
        }
        LiveData<MedicalIdRecord> medicalIdRecordLiveData = ((MedicalIdViewModel) getMViewModel()).getMedicalIdRecordLiveData();
        if (medicalIdRecordLiveData != null) {
            medicalIdRecordLiveData.observe(this, new MedicalIdHomeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: knf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedicalIdHomeActivity.loadData$lambda$2(this.f24022a, (MedicalIdRecord) obj);
                }
            }));
        }
        if (ChannelAndRegionExtKt.isChinaChannelAndInland()) {
            TextView textView = this.lockScreenDescriptionTv;
            if (textView != null) {
                ViewExtKt.visible(textView);
            }
            TextView textView2 = this.lockScreenSolveTv;
            if (textView2 != null) {
                ViewExtKt.visible(textView2);
            }
            ((MedicalIdViewModel) getMViewModel()).getLiveData(MedicalIdSPContract.PREF_LOCK_SCREEN_SHOW, -1).observe(this, new MedicalIdHomeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lnf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedicalIdHomeActivity.loadData$lambda$4(this.f25243a, (Integer) obj);
                }
            }));
            return;
        }
        TextView textView3 = this.lockScreenDescriptionTv;
        if (textView3 != null) {
            ViewExtKt.gone(textView3);
        }
        TextView textView4 = this.lockScreenSolveTv;
        if (textView4 != null) {
            ViewExtKt.gone(textView4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$1(MedicalIdHomeActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mInitStatus = bool.booleanValue();
        MenuItem menuItem = this$0.mMenuItem;
        Intrinsics.checkNotNull(menuItem);
        menuItem.setVisible(Intrinsics.areEqual(bool, Boolean.FALSE) && !this$0.originatesFromEmergencyEntrance);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$2(MedicalIdHomeActivity this$0, MedicalIdRecord medicalIdRecord) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mMedicalIdRecord = medicalIdRecord;
        Logger.d("mMedicalIdRecord mUsername " + (medicalIdRecord != null ? medicalIdRecord.getName() : null), new Object[0]);
        MedicalIdRecord medicalIdRecord2 = this$0.mMedicalIdRecord;
        Logger.d("mMedicalIdRecord mGender " + (medicalIdRecord2 != null ? Integer.valueOf(medicalIdRecord2.getGender()) : null), new Object[0]);
        MedicalIdRecord medicalIdRecord3 = this$0.mMedicalIdRecord;
        Logger.d("mMedicalIdRecord organDonorType " + (medicalIdRecord3 != null ? Integer.valueOf(medicalIdRecord3.getDonorType()) : null), new Object[0]);
        MedicalIdRecord medicalIdRecord4 = this$0.mMedicalIdRecord;
        Logger.d("mMedicalIdRecord birthday " + (medicalIdRecord4 != null ? medicalIdRecord4.getBirthday() : null), new Object[0]);
        MedicalIdRecord medicalIdRecord5 = this$0.mMedicalIdRecord;
        Logger.d("mMedicalIdRecord chronic " + (medicalIdRecord5 != null ? medicalIdRecord5.getChronic() : null), new Object[0]);
        MedicalIdRecord medicalIdRecord6 = this$0.mMedicalIdRecord;
        Logger.d("mMedicalIdRecord allergy " + (medicalIdRecord6 != null ? medicalIdRecord6.getAllergyDrugs() : null), new Object[0]);
        MedicalIdRecord medicalIdRecord7 = this$0.mMedicalIdRecord;
        Logger.d("mMedicalIdRecord contact name " + (medicalIdRecord7 != null ? medicalIdRecord7.getContactName() : null), new Object[0]);
        MedicalIdRecord medicalIdRecord8 = this$0.mMedicalIdRecord;
        Logger.d("mMedicalIdRecord contact number " + (medicalIdRecord8 != null ? medicalIdRecord8.getContactNumber() : null), new Object[0]);
        MedicalIdRecord medicalIdRecord9 = this$0.mMedicalIdRecord;
        Logger.d("mMedicalIdRecord contact relation " + (medicalIdRecord9 != null ? Integer.valueOf(medicalIdRecord9.getContactRelationType()) : null), new Object[0]);
        this$0.refreshView();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$4(MedicalIdHomeActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.updateLockScreenShowDescriptionView(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshAvatar() {
        MedicalIdRecord medicalIdRecord = this.mMedicalIdRecord;
        String strConvertFieldToDisplayString = StringFieldConverter.INSTANCE.convertFieldToDisplayString(medicalIdRecord != null ? medicalIdRecord.getName() : null);
        TextView textView = this.tvName;
        if (textView != null) {
            textView.setText(strConvertFieldToDisplayString);
        }
        String avatarFilePathString = ((MedicalIdViewModel) getMViewModel()).getAvatarFilePathString();
        if (!FileUtils.isExists(avatarFilePathString)) {
            RoundImageView roundImageView = this.avatarImageView;
            Intrinsics.checkNotNull(roundImageView);
            roundImageView.setImageResource(moi.d);
        } else {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(avatarFilePathString);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeFile, "decodeFile(...)");
            RoundImageView roundImageView2 = this.avatarImageView;
            Intrinsics.checkNotNull(roundImageView2);
            roundImageView2.setImageBitmap(bitmapDecodeFile);
        }
    }

    private final void refreshDetailView() {
        Logger.d("REFRESH DETAIL VIEW", new Object[0]);
        if (this.mMedicalIdRecord == null) {
            return;
        }
        refreshAvatar();
        refreshUserInfo();
        refreshMedicalIdInfo();
        refreshEmergencyContact();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshEmergencyContact() {
        MedicalIdRecord medicalIdRecord = this.mMedicalIdRecord;
        if (medicalIdRecord == null) {
            return;
        }
        Integer numValueOf = medicalIdRecord != null ? Integer.valueOf(medicalIdRecord.getContactRelationType()) : null;
        if (numValueOf == null) {
            numValueOf = 0;
        }
        MedicalIdRecord medicalIdRecord2 = this.mMedicalIdRecord;
        String contactName = medicalIdRecord2 != null ? medicalIdRecord2.getContactName() : null;
        MedicalIdRecord medicalIdRecord3 = this.mMedicalIdRecord;
        String contactNumber = medicalIdRecord3 != null ? medicalIdRecord3.getContactNumber() : null;
        Logger.d("fresh emergency contact name " + contactName, new Object[0]);
        Logger.d("fresh emergency contact number " + contactNumber, new Object[0]);
        Logger.d("fresh emergency contact relation " + numValueOf, new Object[0]);
        String strConstructEmergencyContactRemindText = ((MedicalIdViewModel) getMViewModel()).constructEmergencyContactRemindText(numValueOf.intValue(), contactNumber, contactName);
        Logger.d("fresh emergency contact emergencyContactDisplayText " + strConstructEmergencyContactRemindText, new Object[0]);
        boolean zIsBlank = StringsKt__StringsKt.isBlank(strConstructEmergencyContactRemindText);
        DisplayItemView displayItemView = this.emergencyContactView;
        if (displayItemView != null) {
            displayItemView.updateEmergencyContact(zIsBlank, strConstructEmergencyContactRemindText);
        }
    }

    private final void refreshMedicalIdInfo() {
        String treatment;
        MedicalIdRecord medicalIdRecord = this.mMedicalIdRecord;
        String allergyDrugs = medicalIdRecord != null ? medicalIdRecord.getAllergyDrugs() : null;
        boolean zIsBlank = true;
        boolean z = allergyDrugs == null || allergyDrugs.length() == 0;
        StringFieldConverter stringFieldConverter = StringFieldConverter.INSTANCE;
        MedicalIdRecord medicalIdRecord2 = this.mMedicalIdRecord;
        String strConvertFieldToDisplayString = stringFieldConverter.convertFieldToDisplayString(medicalIdRecord2 != null ? medicalIdRecord2.getAllergyDrugs() : null);
        DisplayItemView displayItemView = this.allergyView;
        if (displayItemView != null) {
            displayItemView.updateItemDetailFilled(z, strConvertFieldToDisplayString);
        }
        MedicalIdRecord medicalIdRecord3 = this.mMedicalIdRecord;
        String chronic = medicalIdRecord3 != null ? medicalIdRecord3.getChronic() : null;
        boolean z2 = chronic == null || StringsKt__StringsKt.isBlank(chronic);
        MedicalIdRecord medicalIdRecord4 = this.mMedicalIdRecord;
        String strConvertFieldToDisplayString2 = stringFieldConverter.convertFieldToDisplayString(medicalIdRecord4 != null ? medicalIdRecord4.getChronic() : null);
        DisplayItemView displayItemView2 = this.chronicView;
        if (displayItemView2 != null) {
            displayItemView2.updateItemDetailFilled(z2, strConvertFieldToDisplayString2);
        }
        MedicalIdRecord medicalIdRecord5 = this.mMedicalIdRecord;
        if (medicalIdRecord5 != null && (treatment = medicalIdRecord5.getTreatment()) != null) {
            zIsBlank = StringsKt__StringsKt.isBlank(treatment);
        }
        MedicalIdRecord medicalIdRecord6 = this.mMedicalIdRecord;
        String strConvertFieldToDisplayString3 = stringFieldConverter.convertFieldToDisplayString(medicalIdRecord6 != null ? medicalIdRecord6.getTreatment() : null);
        DisplayItemView displayItemView3 = this.treatmentView;
        if (displayItemView3 != null) {
            displayItemView3.updateItemDetailFilled(zIsBlank, strConvertFieldToDisplayString3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshUserInfo() {
        String string;
        if (this.mMedicalIdRecord == null) {
            return;
        }
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
        yo2 yo2Var = new yo2(((MedicalIdViewModel) getMViewModel()).getLongFromSP(MedicalIdSPContract.PREF_BIRTHDAY, 631123200000L));
        int age = userProfile$default.getAge();
        if (yo2Var.c()) {
            string = getResources().getQuantityString(fyi.f18375a, age, Integer.valueOf(age));
            Intrinsics.checkNotNull(string);
        } else {
            string = getString(o1j.E0);
            Intrinsics.checkNotNull(string);
        }
        String strConvertGenderTypeToDisplayString = GenderTypeConverter.INSTANCE.convertGenderTypeToDisplayString(userProfile$default.getSex());
        TextView textView = this.tvGenderAndAgeTextView;
        if (textView != null) {
            textView.setText(getString(o1j.q0, strConvertGenderTypeToDisplayString, string));
        }
        MedicalIdRecord medicalIdRecord = this.mMedicalIdRecord;
        Intrinsics.checkNotNull(medicalIdRecord);
        int bloodType = medicalIdRecord.getBloodType();
        String strConvertBloodTypeToDisplayString = BloodTypeConverter.INSTANCE.convertBloodTypeToDisplayString(bloodType);
        boolean z = bloodType == 0;
        DisplayItemView displayItemView = this.bloodTypeView;
        if (displayItemView != null) {
            displayItemView.updateItemDetailFilled(z, strConvertBloodTypeToDisplayString);
        }
        MedicalIdRecord medicalIdRecord2 = this.mMedicalIdRecord;
        Intrinsics.checkNotNull(medicalIdRecord2);
        int donorType = medicalIdRecord2.getDonorType();
        boolean z2 = donorType == 0;
        String strConvertDonorTypeToDisplayString = DonorTypeConverter.INSTANCE.convertDonorTypeToDisplayString(Integer.valueOf(donorType));
        DisplayItemView displayItemView2 = this.donorTypeView;
        if (displayItemView2 != null) {
            displayItemView2.updateItemDetailFilled(z2, strConvertDonorTypeToDisplayString);
        }
    }

    private final void refreshView() {
        MedicalIdRecord medicalIdRecord = this.mMedicalIdRecord;
        if (medicalIdRecord == null) {
            return;
        }
        Logger.d("mMedicalIdRecord refreshview username " + (medicalIdRecord != null ? medicalIdRecord.getName() : null), new Object[0]);
        MedicalIdRecord medicalIdRecord2 = this.mMedicalIdRecord;
        Logger.d("mMedicalIdRecord refreshview bloodType " + (medicalIdRecord2 != null ? Integer.valueOf(medicalIdRecord2.getBloodType()) : null), new Object[0]);
        if (this.mInitStatus) {
            View view = this.guideView;
            if (view != null) {
                ViewExtKt.setVisible(view, true);
            }
            View view2 = this.displayView;
            if (view2 != null) {
                ViewExtKt.setVisible(view2, false);
                return;
            }
            return;
        }
        View view3 = this.guideView;
        if (view3 != null) {
            ViewExtKt.setVisible(view3, false);
        }
        View view4 = this.displayView;
        if (view4 != null) {
            ViewExtKt.setVisible(view4, true);
        }
        refreshDetailView();
    }

    private final void showDeleteDialogIfNeed() {
        if (this.menuDialog == null) {
            CommonDialog<DialogParams> commonDialogCreate = new CommonDialog.c("delete_record").setDialogTitle(o1j.S).setDialogDescription(o1j.O).setPositiveText(o1j.N).setNegativeText(o1j.f28645b).create();
            this.menuDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdHomeActivity.showDeleteDialogIfNeed.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        MedicalIdHomeActivity.this.deleteRecord();
                    }
                }
            }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        }
        CommonDialog<DialogParams> commonDialog = this.menuDialog;
        if (commonDialog != null) {
            commonDialog.showIfNeed(getSupportFragmentManager());
        }
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(this, view);
        a4iVar.f(swi.f34061a);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: hnf
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MedicalIdHomeActivity.showPopupMenu$lambda$7(this.f20261a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$7(MedicalIdHomeActivity this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == hsi.o0) {
            this$0.showDeleteDialogIfNeed();
            return true;
        }
        if (itemId != hsi.p0) {
            return true;
        }
        this$0.gotoEditPage();
        return true;
    }

    private final void updateLockScreenShowDescriptionView(int lockScreenStatus) {
        if (this.originatesFromEmergencyEntrance || lockScreenStatus == -1) {
            TextView textView = this.lockScreenDescriptionTv;
            if (textView != null) {
                ViewExtKt.setVisible(textView, false);
            }
            TextView textView2 = this.lockScreenSolveTv;
            if (textView2 != null) {
                ViewExtKt.setVisible(textView2, false);
                return;
            }
            return;
        }
        if (lockScreenStatus != 1) {
            if (lockScreenStatus == 0) {
                TextView textView3 = this.lockScreenDescriptionTv;
                if (textView3 != null) {
                    ViewExtKt.setVisible(textView3, true);
                }
                TextView textView4 = this.lockScreenDescriptionTv;
                if (textView4 != null) {
                    textView4.setText(o1j.l0);
                }
                TextView textView5 = this.lockScreenSolveTv;
                if (textView5 != null) {
                    ViewExtKt.setVisible(textView5, true);
                    return;
                }
                return;
            }
            return;
        }
        TextView textView6 = this.lockScreenDescriptionTv;
        if (textView6 != null) {
            ViewExtKt.setVisible(textView6, true);
        }
        TextView textView7 = this.lockScreenDescriptionTv;
        if (textView7 != null) {
            textView7.setText(o1j.Q0);
        }
        TextView textView8 = this.lockScreenSolveTv;
        if (textView8 != null) {
            ViewExtKt.setVisible(textView8, true);
        }
        TextView textView9 = this.lockScreenSolveTv;
        if (textView9 != null) {
            textView9.setText(" ");
        }
        SpannableString spannableString = new SpannableString(getString(o1j.y));
        spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdHomeActivity.updateLockScreenShowDescriptionView.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                MedicalIdHomeActivity.this.startActivity(new Intent(MedicalIdHomeActivity.this, (Class<?>) MedicalIdLockShowSolveActivity.class));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setUnderlineText(true);
                ds.setColor(MedicalIdHomeActivity.this.getColor(hki.h));
                ds.setFakeBoldText(true);
            }
        }, 0, getString(o1j.y).length(), 33);
        TextView textView10 = this.lockScreenSolveTv;
        if (textView10 != null) {
            textView10.append(getString(o1j.e));
        }
        TextView textView11 = this.lockScreenSolveTv;
        if (textView11 != null) {
            textView11.append(" ");
        }
        TextView textView12 = this.lockScreenSolveTv;
        if (textView12 != null) {
            textView12.append(spannableString);
        }
        TextView textView13 = this.lockScreenSolveTv;
        if (textView13 != null) {
            textView13.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Nullable
    public final RoundImageView getAvatarImageView() {
        return this.avatarImageView;
    }

    @Nullable
    public final DisplayItemView getBloodTypeView() {
        return this.bloodTypeView;
    }

    @Nullable
    public final DisplayItemView getChronicView() {
        return this.chronicView;
    }

    @Nullable
    public final View getDisplayView() {
        return this.displayView;
    }

    @Nullable
    public final DisplayItemView getDonorTypeView() {
        return this.donorTypeView;
    }

    @Nullable
    public final DisplayItemView getEmergencyContactView() {
        return this.emergencyContactView;
    }

    @Nullable
    public final View getGuideView() {
        return this.guideView;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.u;
    }

    @Nullable
    public final TextView getLockScreenDescriptionTv() {
        return this.lockScreenDescriptionTv;
    }

    @Nullable
    public final TextView getLockScreenSolveTv() {
        return this.lockScreenSolveTv;
    }

    public final boolean getMInitStatus() {
        return this.mInitStatus;
    }

    @Nullable
    public final MedicalIdRecord getMMedicalIdRecord() {
        return this.mMedicalIdRecord;
    }

    @Nullable
    public final MenuItem getMMenuItem() {
        return this.mMenuItem;
    }

    @Nullable
    public final CommonDialog<DialogParams> getMenuDialog() {
        return this.menuDialog;
    }

    public final boolean getOriginatesFromEmergencyEntrance() {
        return this.originatesFromEmergencyEntrance;
    }

    @Nullable
    public final DisplayItemView getTreatmentView() {
        return this.treatmentView;
    }

    @Nullable
    public final TextView getTvGenderAndAgeTextView() {
        return this.tvGenderAndAgeTextView;
    }

    @Nullable
    public final TextView getTvName() {
        return this.tvName;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.userinfo.medicalid.view.Hilt_MedicalIdHomeActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean zAreEqual = Intrinsics.areEqual("tel", getIntent().getStringExtra("origin"));
        this.originatesFromEmergencyEntrance = zAreEqual;
        if (zAreEqual) {
            getWindow().addFlags(4194304);
            if (Build.VERSION.SDK_INT > 27) {
                setShowWhenLocked(true);
            } else {
                getWindow().addFlags(524288);
            }
        }
        setActionBarDisplayable(false);
        setTitle(o1j.p0);
        findViews();
        initToolBar();
        loadData();
        adaptNavigationBar();
    }

    public final void setAvatarImageView(@Nullable RoundImageView roundImageView) {
        this.avatarImageView = roundImageView;
    }

    public final void setBloodTypeView(@Nullable DisplayItemView displayItemView) {
        this.bloodTypeView = displayItemView;
    }

    public final void setChronicView(@Nullable DisplayItemView displayItemView) {
        this.chronicView = displayItemView;
    }

    public final void setDisplayView(@Nullable View view) {
        this.displayView = view;
    }

    public final void setDonorTypeView(@Nullable DisplayItemView displayItemView) {
        this.donorTypeView = displayItemView;
    }

    public final void setEmergencyContactView(@Nullable DisplayItemView displayItemView) {
        this.emergencyContactView = displayItemView;
    }

    public final void setGuideView(@Nullable View view) {
        this.guideView = view;
    }

    public final void setLockScreenDescriptionTv(@Nullable TextView textView) {
        this.lockScreenDescriptionTv = textView;
    }

    public final void setLockScreenSolveTv(@Nullable TextView textView) {
        this.lockScreenSolveTv = textView;
    }

    public final void setMInitStatus(boolean z) {
        this.mInitStatus = z;
    }

    public final void setMMedicalIdRecord(@Nullable MedicalIdRecord medicalIdRecord) {
        this.mMedicalIdRecord = medicalIdRecord;
    }

    public final void setMMenuItem(@Nullable MenuItem menuItem) {
        this.mMenuItem = menuItem;
    }

    public final void setMenuDialog(@Nullable CommonDialog<DialogParams> commonDialog) {
        this.menuDialog = commonDialog;
    }

    public final void setOriginatesFromEmergencyEntrance(boolean z) {
        this.originatesFromEmergencyEntrance = z;
    }

    public final void setTreatmentView(@Nullable DisplayItemView displayItemView) {
        this.treatmentView = displayItemView;
    }

    public final void setTvGenderAndAgeTextView(@Nullable TextView textView) {
        this.tvGenderAndAgeTextView = textView;
    }

    public final void setTvName(@Nullable TextView textView) {
        this.tvName = textView;
    }
}
