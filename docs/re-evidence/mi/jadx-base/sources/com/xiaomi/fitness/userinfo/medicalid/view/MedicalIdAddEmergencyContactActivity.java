package com.xiaomi.fitness.userinfo.medicalid.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.userinfo.medicalid.baseui.UserInfoRightArrowSingleLineTextView;
import com.xiaomi.fitness.userinfo.medicalid.util.EmergencyContactConverter;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdAddEmergencyContactActivity;
import com.xiaomi.fitness.userinfo.medicalid.viewmodel.MedicalIdViewModel;
import defpackage.av6;
import defpackage.ehi;
import defpackage.moi;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.pkq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001CB\u0007¢\u0006\u0004\bB\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b'\u0010\u0006\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u000eR$\u0010(\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R(\u00100\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b0\u0010#\u0012\u0004\b3\u0010\u0006\u001a\u0004\b1\u0010%\"\u0004\b2\u0010\u000eR(\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b4\u0010#\u0012\u0004\b7\u0010\u0006\u001a\u0004\b5\u0010%\"\u0004\b6\u0010\u000eR$\u00108\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001a\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R$\u0010;\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001a\u001a\u0004\b<\u0010*\"\u0004\b=\u0010,R\u0014\u0010?\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010%R\u0014\u0010A\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010%¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/view/MedicalIdAddEmergencyContactActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/medicalid/viewmodel/MedicalIdViewModel;", "Lpkq;", "", "setListenerOnUpperLeftBackButton", "()V", "loadBundle", "initContactRelationView", "refreshContactNameAndNumber", "showRelationIfNeed", "", "which", "handleRelationDialogClickResult", "(I)V", "refreshContactRelationViewIfNeed", "saveEmergencyContact", "passBundleAndFinish", "goBackWithoutEditing", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/userinfo/medicalid/baseui/UserInfoRightArrowSingleLineTextView;", "mEmergencyContactView", "Lcom/xiaomi/fitness/userinfo/medicalid/baseui/UserInfoRightArrowSingleLineTextView;", "getMEmergencyContactView", "()Lcom/xiaomi/fitness/userinfo/medicalid/baseui/UserInfoRightArrowSingleLineTextView;", "setMEmergencyContactView", "(Lcom/xiaomi/fitness/userinfo/medicalid/baseui/UserInfoRightArrowSingleLineTextView;)V", "mContactRelation", "I", "getMContactRelation", "()I", "setMContactRelation", "getMContactRelation$annotations", "mContactName", "getMContactName", "()Ljava/lang/String;", "setMContactName", "(Ljava/lang/String;)V", "mContactNumber", "getMContactNumber", "setMContactNumber", "prevValidRelation", "getPrevValidRelation", "setPrevValidRelation", "getPrevValidRelation$annotations", "oContactRelation", "getOContactRelation", "setOContactRelation", "getOContactRelation$annotations", "oContactName", "getOContactName", "setOContactName", "oContactNumber", "getOContactNumber", "setOContactNumber", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MedicalIdAddEmergencyContactActivity extends Hilt_MedicalIdAddEmergencyContactActivity<MedicalIdViewModel, pkq> {

    @NotNull
    public static final String KEY_CONTACT_NAME = "contactName";

    @NotNull
    public static final String KEY_CONTACT_NUMBER = "contactNumber";

    @NotNull
    public static final String KEY_CONTACT_RELATION_TYPE_ID = "contactRelationType";

    @NotNull
    public static final String KEY_EMERGENCY_CONTACT_ADD_FAIL = "contactNumberAddFail";
    public static final int RES_CODE_EDIT_CONTACT = 321;

    @NotNull
    private final String TAG = "MedicalIdAddEmergencyContactActivity";

    @Nullable
    private String mContactName;

    @Nullable
    private String mContactNumber;
    private int mContactRelation;

    @Nullable
    private UserInfoRightArrowSingleLineTextView mEmergencyContactView;

    @Nullable
    private String oContactName;

    @Nullable
    private String oContactNumber;
    private int oContactRelation;
    private int prevValidRelation;

    public static /* synthetic */ void getMContactRelation$annotations() {
    }

    public static /* synthetic */ void getOContactRelation$annotations() {
    }

    public static /* synthetic */ void getPrevValidRelation$annotations() {
    }

    private final void goBackWithoutEditing() {
        Logger.d(this.TAG, "goBackWithoutEditsMade oContactName=" + this.oContactName + " oContactNumber=" + this.oContactNumber + " oContactRelation=" + this.oContactRelation);
        Intent intent = new Intent();
        intent.putExtra(KEY_CONTACT_NAME, this.oContactName);
        intent.putExtra(KEY_CONTACT_NUMBER, this.oContactNumber);
        intent.putExtra(KEY_CONTACT_RELATION_TYPE_ID, this.oContactRelation);
        intent.putExtra(KEY_EMERGENCY_CONTACT_ADD_FAIL, true);
        setResult(321, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleRelationDialogClickResult(int which) {
        if (which >= 0) {
            this.mContactRelation = which;
            this.prevValidRelation = which;
        } else {
            if (which == -2) {
                this.mContactRelation = this.prevValidRelation;
                return;
            }
            this.prevValidRelation = this.mContactRelation;
            ((MedicalIdViewModel) getMViewModel()).setMSelectedRelation(this.mContactRelation);
            refreshContactRelationViewIfNeed();
        }
    }

    private final void initContactRelationView() {
        loadBundle();
        refreshContactNameAndNumber();
        refreshContactRelationViewIfNeed();
        UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView = this.mEmergencyContactView;
        if (userInfoRightArrowSingleLineTextView != null) {
            userInfoRightArrowSingleLineTextView.setOnClickListener(new View.OnClickListener() { // from class: hmf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MedicalIdAddEmergencyContactActivity.initContactRelationView$lambda$1(this.f20237a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initContactRelationView$lambda$1(MedicalIdAddEmergencyContactActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showRelationIfNeed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadBundle() {
        Bundle extras = getIntent().getExtras();
        this.mContactName = extras != null ? extras.getString(KEY_CONTACT_NAME) : null;
        this.mContactNumber = extras != null ? extras.getString(KEY_CONTACT_NUMBER) : null;
        this.mContactRelation = extras != null ? extras.getInt(KEY_CONTACT_RELATION_TYPE_ID) : 0;
        ((MedicalIdViewModel) getMViewModel()).setMSelectedRelation(this.mContactRelation);
        String str = this.mContactName;
        this.oContactName = str;
        this.oContactNumber = this.mContactNumber;
        int i = this.mContactRelation;
        this.oContactRelation = i;
        this.prevValidRelation = i;
        Logger.d(this.TAG, "loadBundle mContactName=" + str);
        Logger.d(this.TAG, "loadBundle mContactNumber=" + this.mContactNumber);
        Logger.d(this.TAG, "loadBundle mContactRelation=" + this.mContactRelation);
    }

    private final void passBundleAndFinish() {
        Logger.d(this.TAG, "goBackWithoutEditsMade mContactName=" + this.mContactName + " mContactNumber=" + this.mContactNumber + " mContactRelation=" + this.mContactRelation);
        Intent intent = new Intent();
        intent.putExtra(KEY_CONTACT_NAME, this.mContactName);
        intent.putExtra(KEY_CONTACT_NUMBER, this.mContactNumber);
        intent.putExtra(KEY_CONTACT_RELATION_TYPE_ID, this.mContactRelation);
        setResult(321, intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshContactNameAndNumber() {
        ((pkq) getMBinding()).B.setText(this.mContactName);
        ((pkq) getMBinding()).C.setText(this.mContactNumber);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshContactRelationViewIfNeed() {
        String str = getResources().getStringArray(ehi.c)[this.mContactRelation];
        UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView = this.mEmergencyContactView;
        if (userInfoRightArrowSingleLineTextView != null) {
            userInfoRightArrowSingleLineTextView.setRemindText(str);
        }
        ((pkq) getMBinding()).D.setTitle(o1j.G0);
        ((pkq) getMBinding()).D.setRemindText(EmergencyContactConverter.INSTANCE.getContactRelationName(this.mContactRelation));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveEmergencyContact() {
        Editable text = ((pkq) getMBinding()).B.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        this.mContactName = StringsKt__StringsKt.trim(text).toString();
        Editable text2 = ((pkq) getMBinding()).C.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        String string = StringsKt__StringsKt.trim(text2).toString();
        this.mContactNumber = string;
        Logger.d(this.TAG, "saveEmergencyContact mContactNumber=|" + string + "|");
        String str = this.mContactNumber;
        if (str != null && str.length() != 0) {
            String str2 = this.mContactNumber;
            Intrinsics.checkNotNull(str2);
            if (!StringsKt__StringsKt.isBlank(str2)) {
                passBundleAndFinish();
                Logger.d(this.TAG, "saveEmergencyContact mContactName=" + this.mContactName + ", mContactNumber=" + this.mContactNumber + ", contactRelation=" + this.mContactRelation);
                return;
            }
        }
        ToastExtKt.toastShort(this, o1j.a0);
        goBackWithoutEditing();
    }

    private final void setListenerOnUpperLeftBackButton() {
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, moi.e, getString(o1j.H), new View.OnClickListener() { // from class: imf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedicalIdAddEmergencyContactActivity.setListenerOnUpperLeftBackButton$lambda$0(this.f21294a, view);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListenerOnUpperLeftBackButton$lambda$0(MedicalIdAddEmergencyContactActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showRelationIfNeed() {
        new CommonDialog.c("contact_relation").setDialogTitle(o1j.G0).setNegativeText(o1j.f28645b).setPositiveText(o1j.T).setItems(getResources().getStringArray(ehi.c)).setItemsCheckedIndex(((MedicalIdViewModel) getMViewModel()).getMSelectedRelation()).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdAddEmergencyContactActivity.showRelationIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                Logger.d(MedicalIdAddEmergencyContactActivity.this.TAG, "showRelationIfNeed which=" + which);
                MedicalIdAddEmergencyContactActivity.this.handleRelationDialogClickResult(which);
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.F;
    }

    @Nullable
    public final String getMContactName() {
        return this.mContactName;
    }

    @Nullable
    public final String getMContactNumber() {
        return this.mContactNumber;
    }

    public final int getMContactRelation() {
        return this.mContactRelation;
    }

    @Nullable
    public final UserInfoRightArrowSingleLineTextView getMEmergencyContactView() {
        return this.mEmergencyContactView;
    }

    @Nullable
    public final String getOContactName() {
        return this.oContactName;
    }

    @Nullable
    public final String getOContactNumber() {
        return this.oContactNumber;
    }

    public final int getOContactRelation() {
        return this.oContactRelation;
    }

    public final int getPrevValidRelation() {
        return this.prevValidRelation;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        saveEmergencyContact();
        Logger.d(this.TAG, "onBackPressed running!");
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.medicalid.view.Hilt_MedicalIdAddEmergencyContactActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(o1j.Z);
        setListenerOnUpperLeftBackButton();
        this.mEmergencyContactView = ((pkq) getMBinding()).D;
        initContactRelationView();
    }

    public final void setMContactName(@Nullable String str) {
        this.mContactName = str;
    }

    public final void setMContactNumber(@Nullable String str) {
        this.mContactNumber = str;
    }

    public final void setMContactRelation(int i) {
        this.mContactRelation = i;
    }

    public final void setMEmergencyContactView(@Nullable UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView) {
        this.mEmergencyContactView = userInfoRightArrowSingleLineTextView;
    }

    public final void setOContactName(@Nullable String str) {
        this.oContactName = str;
    }

    public final void setOContactNumber(@Nullable String str) {
        this.oContactNumber = str;
    }

    public final void setOContactRelation(int i) {
        this.oContactRelation = i;
    }

    public final void setPrevValidRelation(int i) {
        this.prevValidRelation = i;
    }
}
