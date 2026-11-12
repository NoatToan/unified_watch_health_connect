package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.eg4;
import defpackage.fg4;
import defpackage.qyi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\t\b\u0007¢\u0006\u0004\b5\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR.\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u001f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u0017\u0010!\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000eR#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010\f\u001a\u0004\b+\u0010\u000eR\u0017\u0010,\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010\f\u001a\u0004\b-\u0010\u000eR\u0017\u0010.\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\u000eR%\u00102\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00040\u0004008\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u0005\u00104¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "", "count", "", "getSosContactCountText", "(I)Ljava/lang/String;", "", "refreshSosContactCountText", "()V", "Landroidx/databinding/ObservableBoolean;", "sosContactLoaded", "Landroidx/databinding/ObservableBoolean;", "getSosContactLoaded", "()Landroidx/databinding/ObservableBoolean;", "Lfg4;", "value", "emergencyContact", "Lfg4;", "getEmergencyContact", "()Lfg4;", "setEmergencyContact", "(Lfg4;)V", "sosContactSwitchOn", "getSosContactSwitchOn", "sosContactSmsSwitchOn", "getSosContactSmsSwitchOn", "shareLocationSwitchOn", "getShareLocationSwitchOn", "fallDetectionSwitchOn", "getFallDetectionSwitchOn", "callMedicalSwitchOn", "getCallMedicalSwitchOn", "support120", "getSupport120", "Landroidx/databinding/ObservableField;", "", "Leg4;", "sosContactList", "Landroidx/databinding/ObservableField;", "getSosContactList", "()Landroidx/databinding/ObservableField;", "supportFallDetection", "getSupportFallDetection", "supportSosSms", "getSupportSosSms", "supportShareLocation", "getSupportShareLocation", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "sosContactCountText", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FallDetectionModel extends BaseModel {

    @NotNull
    private static final String TAG = "FallDetectionModel";

    @Nullable
    private fg4 emergencyContact;

    @NotNull
    private final MutableLiveData<String> sosContactCountText;

    @NotNull
    private final ObservableField<List<eg4>> sosContactList;

    @NotNull
    private final ObservableBoolean supportFallDetection;

    @NotNull
    private final ObservableBoolean supportShareLocation;

    @NotNull
    private final ObservableBoolean supportSosSms;

    @NotNull
    private final ObservableBoolean sosContactLoaded = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean sosContactSwitchOn = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean sosContactSmsSwitchOn = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean shareLocationSwitchOn = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean fallDetectionSwitchOn = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean callMedicalSwitchOn = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean support120 = new ObservableBoolean(!AppUtil.INSTANCE.isPlayChannel());

    public FallDetectionModel() {
        ObservableField<List<eg4>> observableField = new ObservableField<>();
        this.sosContactList = observableField;
        this.supportFallDetection = new ObservableBoolean(false);
        this.supportSosSms = new ObservableBoolean(false);
        this.supportShareLocation = new ObservableBoolean(false);
        List<eg4> list = observableField.get();
        this.sosContactCountText = new MutableLiveData<>(getSosContactCountText(list != null ? list.size() : 0));
    }

    @NotNull
    public final ObservableBoolean getCallMedicalSwitchOn() {
        return this.callMedicalSwitchOn;
    }

    @Nullable
    public final fg4 getEmergencyContact() {
        return this.emergencyContact;
    }

    @NotNull
    public final ObservableBoolean getFallDetectionSwitchOn() {
        return this.fallDetectionSwitchOn;
    }

    @NotNull
    public final ObservableBoolean getShareLocationSwitchOn() {
        return this.shareLocationSwitchOn;
    }

    @NotNull
    public final MutableLiveData<String> getSosContactCountText() {
        return this.sosContactCountText;
    }

    @NotNull
    public final ObservableField<List<eg4>> getSosContactList() {
        return this.sosContactList;
    }

    @NotNull
    public final ObservableBoolean getSosContactLoaded() {
        return this.sosContactLoaded;
    }

    @NotNull
    public final ObservableBoolean getSosContactSmsSwitchOn() {
        return this.sosContactSmsSwitchOn;
    }

    @NotNull
    public final ObservableBoolean getSosContactSwitchOn() {
        return this.sosContactSwitchOn;
    }

    @NotNull
    public final ObservableBoolean getSupport120() {
        return this.support120;
    }

    @NotNull
    public final ObservableBoolean getSupportFallDetection() {
        return this.supportFallDetection;
    }

    @NotNull
    public final ObservableBoolean getSupportShareLocation() {
        return this.supportShareLocation;
    }

    @NotNull
    public final ObservableBoolean getSupportSosSms() {
        return this.supportSosSms;
    }

    public final void refreshSosContactCountText() {
        MutableLiveData<String> mutableLiveData = this.sosContactCountText;
        List<eg4> list = this.sosContactList.get();
        mutableLiveData.postValue(getSosContactCountText(list != null ? list.size() : 0));
    }

    public final void setEmergencyContact(@Nullable fg4 fg4Var) {
        ArrayList arrayList;
        List<eg4> mutableList;
        this.emergencyContact = fg4Var;
        this.supportFallDetection.set(!(fg4Var != null && fg4Var.h == 0));
        this.supportSosSms.set(!(fg4Var != null && fg4Var.g == 0));
        this.supportShareLocation.set(!(fg4Var != null && fg4Var.j == 0));
        this.sosContactSwitchOn.set(fg4Var != null ? fg4Var.c : false);
        this.sosContactSmsSwitchOn.set(fg4Var != null && fg4Var.g == 1);
        this.fallDetectionSwitchOn.set(fg4Var != null && fg4Var.h == 1);
        this.shareLocationSwitchOn.set(fg4Var != null && fg4Var.j == 1);
        this.callMedicalSwitchOn.set(fg4Var != null && fg4Var.i);
        eg4 eg4Var = fg4Var != null ? fg4Var.e : null;
        eg4[] eg4VarArr = fg4Var != null ? fg4Var.f : null;
        ObservableField<List<eg4>> observableField = this.sosContactList;
        if (eg4Var != null && eg4VarArr != null && eg4VarArr.length != 0) {
            arrayList = new ArrayList();
            arrayList.add(eg4Var);
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, eg4VarArr);
        } else if (eg4Var != null) {
            arrayList = new ArrayList();
            arrayList.add(eg4Var);
        } else {
            arrayList = new ArrayList();
        }
        observableField.set(arrayList);
        FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
        if (this.sosContactList.get() == null) {
            mutableList = new ArrayList<>();
        } else {
            List<eg4> list = this.sosContactList.get();
            Intrinsics.checkNotNull(list);
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        }
        fallDetectionHelper.setSLocalEmergencyContactList(mutableList);
        refreshSosContactCountText();
    }

    private final String getSosContactCountText(int count) {
        return ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.s, count, Integer.valueOf(count));
    }
}
