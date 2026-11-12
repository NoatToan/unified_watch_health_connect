package com.huami.phone_call.sms;

import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phone_call.sms.data.PermissionInfo;
import com.huami.phone_call.sms.data.SmsReplySetting;
import com.xiaomi.market.sdk.Constants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b*\u0010+J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R*\u0010 \u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010$\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001d\u0010)\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/huami/phone_call/sms/SmsReplySettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/phone_call/sms/data/SmsReplySetting;", "", "b", "", "a", "", "refresh", "enable", "setEnable", "Lcom/huami/phone_call/sms/PhoneCallSmsReplyFeature;", "Lcom/huami/phone_call/sms/PhoneCallSmsReplyFeature;", Constants.JSON_FEATURE, "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getSettingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "settingLiveData", "", "Lcom/huami/phone_call/sms/data/PermissionInfo;", "c", "getPermissionLiveData", "permissionLiveData", "value", GoogleApiAvailabilityLight.a, "Z", "getPhoneAlertEnable", "()Z", "setPhoneAlertEnable", "(Z)V", "phoneAlertEnable", "e", "getDeviceConnected", "setDeviceConnected", "deviceConnected", "f", "Lkotlin/Lazy;", "getSendSmsPermission", "()Lcom/huami/phone_call/sms/data/PermissionInfo;", "sendSmsPermission", "<init>", "(Lcom/huami/phone_call/sms/PhoneCallSmsReplyFeature;)V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public final class SmsReplySettingViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PhoneCallSmsReplyFeature feature;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SmsReplySetting> settingLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<PermissionInfo>> permissionLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean phoneAlertEnable = true;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean deviceConnected = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendSmsPermission = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/phone_call/sms/data/PermissionInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PermissionInfo> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PermissionInfo invoke() {
            return new PermissionInfo("android.permission.SEND_SMS", R.string.phone_call_reply_send_sms_permission, Integer.valueOf(R.string.phone_call_reply_send_sms_permission_tips));
        }
    }

    public SmsReplySettingViewModel(@NotNull PhoneCallSmsReplyFeature phoneCallSmsReplyFeature) {
        this.feature = phoneCallSmsReplyFeature;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(String str) {
        return ContextCompat.checkSelfPermission(this.feature.getContext(), str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(SmsReplySetting smsReplySetting) {
        return smsReplySetting.getVisible() && smsReplySetting.getDeviceConnected() && smsReplySetting.getPhoneAlertEnable() && smsReplySetting.getReplyEnable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PermissionInfo getSendSmsPermission() {
        return (PermissionInfo) this.sendSmsPermission.getValue();
    }

    public final boolean getDeviceConnected() {
        return this.deviceConnected;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<List<PermissionInfo>> getPermissionLiveData() {
        return this.permissionLiveData;
    }

    public final boolean getPhoneAlertEnable() {
        return this.phoneAlertEnable;
    }

    @NotNull
    public final MutableLiveData<SmsReplySetting> getSettingLiveData() {
        return this.settingLiveData;
    }

    public final void refresh() {
        e.f(ViewModelKt.getViewModelScope(this), com.huami.phone_call.sms.ktx.ViewModelKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SmsReplySettingViewModel$refresh$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void setDeviceConnected(boolean z) {
        if (this.deviceConnected == z) {
            return;
        }
        this.deviceConnected = z;
        refresh();
    }

    public final void setEnable(boolean enable) {
        e.f(ViewModelKt.getViewModelScope(this), com.huami.phone_call.sms.ktx.ViewModelKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SmsReplySettingViewModel$setEnable$$inlined$safeLaunch$1(null, this, enable), 2, null);
    }

    public final void setPhoneAlertEnable(boolean z) {
        if (this.phoneAlertEnable == z) {
            return;
        }
        this.phoneAlertEnable = z;
        refresh();
    }
}
