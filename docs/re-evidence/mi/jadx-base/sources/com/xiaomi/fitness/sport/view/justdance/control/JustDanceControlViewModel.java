package com.xiaomi.fitness.sport.view.justdance.control;

import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.view.justdance.JDSocketHelper;
import com.xiaomi.fitness.sport.view.justdance.PauseSliderData;
import com.xiaomi.fitness.sport.view.justdance.PhoneActionNavigation;
import com.xiaomi.fitness.sport.view.justdance.PlayerData;
import com.xiaomi.fitness.sport.view.justdance.ProfileData;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_xms.data.SensorData;
import com.xiaomi.fitness.sport_xms_export.JDSportStateChangeListener;
import com.xiaomi.fitness.sport_xms_export.SportXmsHelper;
import com.xiaomi.fitness.sport_xms_export.SportXmsHelperExtKt;
import defpackage.c1j;
import defpackage.clb;
import defpackage.nv1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt__ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001nB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020I2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020G0LJ\u0010\u0010M\u001a\u00020G2\b\u0010N\u001a\u0004\u0018\u00010IJ\u0010\u0010O\u001a\u00020G2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010P\u001a\u00020G2\u0006\u0010N\u001a\u00020I2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010Q\u001a\u00020G2\u0006\u0010R\u001a\u00020S2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010T\u001a\u00020G2\u0006\u0010R\u001a\u00020S2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010U\u001a\u00020G2\u0006\u0010R\u001a\u00020SH\u0002J\u0010\u0010V\u001a\u00020G2\u0006\u0010R\u001a\u00020SH\u0002J\u0010\u0010W\u001a\u00020G2\u0006\u0010R\u001a\u00020SH\u0002J\u0010\u0010X\u001a\u00020G2\u0006\u0010R\u001a\u00020SH\u0002J\u0010\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020\bH\u0002J\u0010\u0010\\\u001a\u00020G2\u0006\u0010R\u001a\u00020SH\u0002J\u0010\u0010]\u001a\u00020G2\b\u0010N\u001a\u0004\u0018\u00010IJ\u0010\u0010^\u001a\u00020G2\u0006\u0010R\u001a\u00020SH\u0002J\b\u0010_\u001a\u00020GH\u0002J\u0014\u0010`\u001a\u00020G2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020G0bJ\b\u0010c\u001a\u00020GH\u0002J\u0006\u0010d\u001a\u00020GJ\b\u0010i\u001a\u00020GH\u0002J\u0006\u0010j\u001a\u00020GR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aRU\u0010\u001c\u001aD\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\n¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0$0\u001ej\b\u0012\u0004\u0012\u00020\r`\u001d¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R!\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b*\u0010\u000fR\u001b\u0010,\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b.\u0010/R!\u00101\u001a\b\u0012\u0004\u0012\u00020)0\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0011\u001a\u0004\b2\u0010\u001aR\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001b\u0010=\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0011\u001a\u0004\b?\u0010@R\u0016\u0010B\u001a\u0004\u0018\u00010C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u000e\u0010Y\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010e\u001a\b\u0012\u0004\u0012\u0002070f¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlModel;", "<init>", "()V", "webSocket", "Lokhttp3/WebSocket;", "socketDisconnected", "", "playerId", "", "navigationItems", "Landroidx/databinding/ObservableArrayList;", "Lcom/xiaomi/fitness/sport/view/justdance/PhoneActionNavigation;", "getNavigationItems", "()Landroidx/databinding/ObservableArrayList;", "navigationItems$delegate", "Lkotlin/Lazy;", "navigationAdapter", "Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceNavigationAdapter;", "getNavigationAdapter", "()Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceNavigationAdapter;", "navigationAdapter$delegate", "navigationBindings", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getNavigationBindings", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "navigationBindings$delegate", "navigationHolder", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "viewType", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "getNavigationHolder", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "playerDataItems", "Lcom/xiaomi/fitness/sport/view/justdance/PlayerData;", "getPlayerDataItems", "playerDataItems$delegate", "playerDataAdapter", "Lcom/xiaomi/fitness/sport/view/justdance/control/JustDancePlayerAdapter;", "getPlayerDataAdapter", "()Lcom/xiaomi/fitness/sport/view/justdance/control/JustDancePlayerAdapter;", "playerDataAdapter$delegate", "playerDataBindings", "getPlayerDataBindings", "playerDataBindings$delegate", "sportStateCaller", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "startTimeStamp", "", "showHomeOwner", "serverSyncer", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "connectSwitch", "", DeviceInfo.Builder.PrivateDataKey.IP, "", com.xiaomi.onetrack.api.b.F, "connect", "Lkotlin/Function1;", "sendCmd", "text", "sendHello", "handleReceive", "handleHandShake", "jsonObject", "Lorg/json/JSONObject;", "handleSyncEnd", "handleUserProfile", "handleCollectionData", "handlePhoneUiShortcutData", "handleSetupData", "enableAccelValuesSending", "handleSportData", "enabled", "handleOpenKeyBoard", "sendKeyBoardText", "handleRecapUiData", "handleVibrate", "handleTrigger", "hasOngoingSport", "Lkotlin/Function0;", "startSport", "stopSport", "recordEmitter", "Landroidx/lifecycle/MutableLiveData;", "getRecordEmitter", "()Landroidx/lifecycle/MutableLiveData;", "addSportListener", "destroyWebSocket", "TAG", "getTAG", "()Ljava/lang/String;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJustDanceControlViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JustDanceControlViewModel.kt\ncom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,589:1\n1863#2,2:590\n37#3:592\n36#3,3:593\n*S KotlinDebug\n*F\n+ 1 JustDanceControlViewModel.kt\ncom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlViewModel\n*L\n553#1:590,2\n559#1:592\n559#1:593,3\n*E\n"})
public final class JustDanceControlViewModel extends BaseViewModel<JustDanceControlModel> {

    @NotNull
    private static final String CONNECT_PARAM = "/xiaomi";

    @NotNull
    private static final String CONNECT_PARAM_TEST = "/smartphone";
    private boolean enableAccelValuesSending;
    private int playerId;
    private boolean showHomeOwner;

    @Nullable
    private WebSocket webSocket;
    private boolean socketDisconnected = true;

    /* JADX INFO: renamed from: navigationItems$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationItems = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mxd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JustDanceControlViewModel.navigationItems_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: navigationAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nxd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JustDanceControlViewModel.navigationAdapter_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: navigationBindings$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationBindings = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oxd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JustDanceControlViewModel.navigationBindings_delegate$lambda$2(this.f29785a);
        }
    });

    @NotNull
    private final Function2<View, Integer, BaseViewHolder<PhoneActionNavigation>> navigationHolder = new Function2() { // from class: pxd
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return JustDanceControlViewModel.navigationHolder$lambda$3((View) obj, ((Integer) obj2).intValue());
        }
    };

    /* JADX INFO: renamed from: playerDataItems$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy playerDataItems = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qxd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JustDanceControlViewModel.playerDataItems_delegate$lambda$4();
        }
    });

    /* JADX INFO: renamed from: playerDataAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy playerDataAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rxd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JustDanceControlViewModel.playerDataAdapter_delegate$lambda$5();
        }
    });

    /* JADX INFO: renamed from: playerDataBindings$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy playerDataBindings = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: exd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JustDanceControlViewModel.playerDataBindings_delegate$lambda$6(this.f17159a);
        }
    });

    @NotNull
    private final ISportRemoteState sportStateCaller = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
    private long startTimeStamp = -1;

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fxd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JustDanceControlViewModel.gson_delegate$lambda$7();
        }
    });

    @NotNull
    private final MutableLiveData<Long> recordEmitter = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel$handleRecapUiData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel$handleRecapUiData$1", f = "JustDanceControlViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONObject $jsonObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29921(JSONObject jSONObject, Continuation<? super C29921> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JustDanceControlViewModel.this.new C29921(this.$jsonObject, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JustDanceControlViewModel.this.getMModel().getShowRecap().set(true);
            JustDanceControlViewModel.this.getMModel().getSongData().setSongName(this.$jsonObject.optString("songName"));
            JustDanceControlViewModel.this.getMModel().getSongData().setShareUrl(this.$jsonObject.optString("shareUrl"));
            JustDanceControlViewModel.this.getPlayerDataItems().clear();
            JSONArray jSONArrayOptJSONArray = this.$jsonObject.optJSONArray("playerDataList");
            if (jSONArrayOptJSONArray != null) {
                JustDanceControlViewModel.this.getMModel().getShowPlayerList().set(true);
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    PlayerData playerData = (PlayerData) JustDanceControlViewModel.this.getGson().fromJson(jSONArrayOptJSONArray.optJSONObject(i).toString(), PlayerData.class);
                    playerData.setAvatarImg(JDSocketHelper.INSTANCE.getImagePath(playerData.getAvatarImg()));
                    JustDanceControlViewModel.this.getPlayerDataItems().add(playerData);
                }
            } else {
                JustDanceControlViewModel.this.getMModel().getShowPlayerList().set(false);
            }
            JustDanceControlViewModel.this.getMModel().refreshRecap();
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                JustDanceControlViewModel.this.getMModel().getDisplayText().postValue(ApplicationExtKt.getApplication().getString(c1j.k2));
            } else {
                JustDanceControlViewModel.this.getMModel().getDisplayText().postValue("");
            }
            try {
                Logger.d(JustDanceControlViewModel.this.getTAG(), "insertSwitchSong-controlmodel:" + this.$jsonObject);
                JustDanceControlViewModel.this.getServerSyncer().insertSwitchSongRecord(JustDanceControlViewModel.this.startTimeStamp / ((long) 1000), JustDanceControlViewModel.this.playerId, this.$jsonObject.toString());
            } catch (Exception e) {
                Logger.e(JustDanceControlViewModel.this.getTAG(), "insert song record exception", e);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel$handleReceive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel$handleReceive$1", f = "JustDanceControlViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONObject $jsonObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29931(JSONObject jSONObject, Continuation<? super C29931> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JustDanceControlViewModel.this.new C29931(this.$jsonObject, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JustDanceControlViewModel.this.handlePhoneUiShortcutData(this.$jsonObject);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel$handleReceive$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel$handleReceive$2", f = "JustDanceControlViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29942 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONObject $jsonObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29942(JSONObject jSONObject, Continuation<? super C29942> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JustDanceControlViewModel.this.new C29942(this.$jsonObject, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JustDanceControlViewModel.this.handleSetupData(this.$jsonObject);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void addSportListener() {
        JustDanceControlSender.INSTANCE.addWearControlListener(new Function1() { // from class: dxd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceControlViewModel.addSportListener$lambda$14(this.f16030a, ((Integer) obj).intValue());
            }
        });
        SportXmsHelper.Companion companion = SportXmsHelper.INSTANCE;
        SportXmsHelperExtKt.getInstance(companion).setSportStateChangedListener(new JDSportStateChangeListener() { // from class: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel.addSportListener.2
            @Override // com.xiaomi.fitness.sport_xms_export.JDSportStateChangeListener
            public void onSportFinish() {
                Logger.i(JustDanceControlViewModel.this.getTAG(), "onSportFinish");
                JustDanceControlViewModel.this.destroyWebSocket();
                JustDanceControlSender.INSTANCE.destroy();
                try {
                    JustDanceControlViewModel.this.getServerSyncer().syncSwitchSongRecordWithServer();
                    if (JustDanceControlViewModel.this.getDeviceModel() != null) {
                        JustDanceControlViewModel.this.getRecordEmitter().postValue(Long.valueOf(System.currentTimeMillis()));
                    }
                } catch (Exception e) {
                    FitnessLogUtils.e(JustDanceControlViewModel.this.getTAG(), "syncSwitchSongRecordWithServer exception", e);
                }
            }

            @Override // com.xiaomi.fitness.sport_xms_export.JDSportStateChangeListener
            public void onSportPause() {
                Logger.i(JustDanceControlViewModel.this.getTAG(), "onSportPause");
            }

            @Override // com.xiaomi.fitness.sport_xms_export.JDSportStateChangeListener
            public void onSportStart() {
                Logger.i(JustDanceControlViewModel.this.getTAG(), "onSportStart");
            }
        });
        SportXmsHelperExtKt.getInstance(companion).setSportXmsSensorDataChangedListener(new Function1() { // from class: jxd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceControlViewModel.addSportListener$lambda$17(this.f23219a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSportListener$lambda$14(JustDanceControlViewModel this$0, int i) {
        String up;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 1) {
            up = this$0.getMModel().getWsCommand().getUP();
        } else if (i == 2) {
            up = this$0.getMModel().getWsCommand().getDOWN();
        } else if (i == 3) {
            up = this$0.getMModel().getWsCommand().getLEFT();
        } else if (i != 4) {
            up = i != 5 ? this$0.getMModel().getWsCommand().getSHORTCUT_BACK() : this$0.getMModel().getWsCommand().getVALID();
        } else {
            up = this$0.getMModel().getWsCommand().getRIGHT();
        }
        this$0.sendCmd(up);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSportListener$lambda$17(final JustDanceControlViewModel this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.enableAccelValuesSending) {
            return Unit.INSTANCE;
        }
        JustDanceControlSender.INSTANCE.enqueueAccData(list, new Function2() { // from class: ixd
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return JustDanceControlViewModel.addSportListener$lambda$17$lambda$16(this.f22193a, (List) obj, ((Integer) obj2).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSportListener$lambda$17$lambda$16(JustDanceControlViewModel this$0, List list, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SensorData sensorData = (SensorData) it.next();
            arrayList.add(new Float[]{Float.valueOf(sensorData.getX() / 9.8f), Float.valueOf(sensorData.getY() / 9.8f), Float.valueOf(sensorData.getZ() / 9.8f)});
        }
        this$0.sendCmd("{\"root\":{\"__class\": \"JD_PhoneScoringData\", \"timeStamp\": " + i + ", \"accelData\": " + ArraysKt__ArraysKt.contentDeepToString(arrayList.toArray(new Float[0][])) + "}}");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessServerSyncer getServerSyncer() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$7() {
        return new Gson();
    }

    private final void handleCollectionData(JSONObject jsonObject) {
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("availableInput");
        getMModel().getWsCommand().setUP(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("UP") : null);
        getMModel().getWsCommand().setDOWN(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("DOWN") : null);
        getMModel().getWsCommand().setRIGHT(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("RIGHT") : null);
        getMModel().getWsCommand().setLEFT(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("LEFT") : null);
        getMModel().getWsCommand().setVALID(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("VALID") : null);
    }

    private final void handleHandShake(JSONObject jsonObject, WebSocket webSocket) {
        String str = "{\"root\":{\"__class\": \"JD_PhoneDataCmdSync\", \"phoneID\": " + jsonObject.optInt("phoneID") + "}}";
        Logger.i(getTAG(), "sendSyncStart: " + str);
        webSocket.send(str);
    }

    private final void handleOpenKeyBoard(JSONObject jsonObject) {
        getMModel().getIsUseKeyBoard().set(true);
        getMModel().refreshKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void handlePhoneUiShortcutData(JSONObject jsonObject) {
        String strOptString;
        String strOptString2;
        String strOptString3;
        getNavigationItems().clear();
        getMModel().getShowBack().set(false);
        getMModel().setSweatMode(jsonObject.optInt("isSweatMode") == 1);
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("navigationBar");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString4 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("title") : null;
                if (strOptString4 != null) {
                    switch (strOptString4.hashCode()) {
                        case -1383205665:
                            if (!strOptString4.equals("[icon:GEN-BACK] 取消")) {
                            }
                            break;
                        case -1382735711:
                            if (!strOptString4.equals("[icon:GEN-BACK] 跳过")) {
                                break;
                            }
                            break;
                        case -1382735369:
                            if (!strOptString4.equals("[icon:GEN-BACK] 返回")) {
                            }
                            break;
                        case -1382735257:
                            if (!strOptString4.equals("[icon:GEN-BACK] 退出")) {
                            }
                            break;
                        default:
                            continue;
                    }
                    getMModel().getShowBack().set(true);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jsonObject.optJSONArray("shortcuts");
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                String str = (jSONObjectOptJSONObject2 == null || (strOptString3 = jSONObjectOptJSONObject2.optString("shortcutType")) == null) ? "" : strOptString3;
                if (!Intrinsics.areEqual(str, "SHORTCUT_VALIDATE")) {
                    if (jSONObjectOptJSONObject2 == null || (strOptString = jSONObjectOptJSONObject2.optString("title")) == null) {
                        strOptString = "";
                    }
                    getNavigationItems().add(new PhoneActionNavigation(strOptString, (jSONObjectOptJSONObject2 == null || (strOptString2 = jSONObjectOptJSONObject2.optString("command")) == null) ? "" : strOptString2, str, getMModel().getIsSweatMode(), length2));
                }
            }
        }
        getNavigationAdapter().setOnItemClickListener(new Function3() { // from class: gxd
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return JustDanceControlViewModel.handlePhoneUiShortcutData$lambda$8(this.f19431a, (PhoneActionNavigation) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePhoneUiShortcutData$lambda$8(JustDanceControlViewModel this$0, PhoneActionNavigation phoneActionNavigation, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(phoneActionNavigation, "phoneActionNavigation");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        this$0.sendCmd(phoneActionNavigation.getCommand());
        return Unit.INSTANCE;
    }

    private final void handleRecapUiData(JSONObject jsonObject) {
        AnyExtKt.main$default(null, new C29921(jsonObject, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void handleReceive(String text, WebSocket webSocket) {
        if (this.socketDisconnected) {
            Logger.i(getTAG(), "receive " + text + " but socket disconnected");
        }
        JSONObject jSONObject = new JSONObject(text);
        String strOptString = jSONObject.optString("__class");
        if (strOptString == null || strOptString.length() == 0) {
            Logger.e(getTAG(), "receive " + text + " but can not get class");
            return;
        }
        Logger.i(getTAG(), "handleReceive: " + strOptString);
        if (strOptString != null) {
            switch (strOptString.hashCode()) {
                case -2102812214:
                    if (strOptString.equals("JD_PhoneUiSetupData")) {
                        AnyExtKt.main$default(null, new C29942(jSONObject, null), 1, null);
                        break;
                    }
                    break;
                case -1963259470:
                    if (strOptString.equals("JD_RecapPhoneUiData")) {
                        handleRecapUiData(jSONObject);
                        break;
                    }
                    break;
                case -1905521238:
                    if (strOptString.equals("JD_DisableAccelValuesSending_ConsoleCommandData")) {
                        handleSportData(false);
                        break;
                    }
                    break;
                case -1876788391:
                    if (strOptString.equals("JD_PhoneDataCmdSyncEnd")) {
                        handleSyncEnd(jSONObject, webSocket);
                        break;
                    }
                    break;
                case -1571018345:
                    if (strOptString.equals("JD_PhoneDataCmdHandshakeContinue")) {
                        handleHandShake(jSONObject, webSocket);
                        break;
                    }
                    break;
                case -1070645203:
                    if (strOptString.equals("JD_PhoneUiShortcutData")) {
                        AnyExtKt.main$default(null, new C29931(jSONObject, null), 1, null);
                        break;
                    }
                    break;
                case -907192489:
                    if (strOptString.equals("JD_OpenPhoneKeyboard_ConsoleCommandData")) {
                        handleOpenKeyBoard(jSONObject);
                        break;
                    }
                    break;
                case -810070715:
                    if (strOptString.equals("JD_EnableAccelValuesSending_ConsoleCommandData")) {
                        handleSportData(true);
                        break;
                    }
                    break;
                case -433160888:
                    if (strOptString.equals("JD_ProfilePhoneUiData")) {
                        handleUserProfile(jSONObject);
                        break;
                    }
                    break;
                case 397431143:
                    if (strOptString.equals("JD_PlaySound_ConsoleCommandData")) {
                        handleVibrate();
                        break;
                    }
                    break;
                case 1963006101:
                    if (strOptString.equals("JD_InputCollectionPhoneData")) {
                        handleCollectionData(jSONObject);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final void handleSetupData(JSONObject jsonObject) {
        boolean z;
        JSONArray jSONArrayOptJSONArray;
        ProfileData profileData;
        String strOptString;
        String strOptString2;
        if (jsonObject.has("setupData")) {
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("setupData");
            Intrinsics.checkNotNull(jSONObjectOptJSONObject);
            boolean zHas = jSONObjectOptJSONObject.has("displayText");
            String strOptString3 = jSONObjectOptJSONObject.optString("displayText");
            if (zHas) {
                Intrinsics.checkNotNull(strOptString3);
                if (strOptString3.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        String str = "";
        if (jsonObject.has("disabledSetup")) {
            JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject("disabledSetup");
            if (jSONObjectOptJSONObject2 == null || (strOptString = jSONObjectOptJSONObject2.optString("displayText")) == null) {
                strOptString = "";
            }
            if (strOptString.length() == 0) {
                JSONObject jSONObjectOptJSONObject3 = jsonObject.optJSONObject("setupData");
                if (jSONObjectOptJSONObject3 != null && (strOptString2 = jSONObjectOptJSONObject3.optString("displayText")) != null) {
                    str = strOptString2;
                }
                strOptString = str;
            }
            getMModel().getDisplayText().postValue(strOptString);
        } else {
            getMModel().getDisplayText().postValue("");
        }
        if (z) {
            return;
        }
        ObservableBoolean isEnabled = getMModel().getIsEnabled();
        JSONObject jSONObjectOptJSONObject4 = jsonObject.optJSONObject("inputSetup");
        isEnabled.set(jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.optInt("isEnabled") == 1);
        boolean z2 = jsonObject.optInt("isMaster") == 1;
        if (z2 && !this.showHomeOwner && (profileData = getMModel().getUserProfile().get()) != null) {
            profileData.setName(profileData.getName() + ApplicationExtKt.getApplication().getString(c1j.U1));
            this.showHomeOwner = true;
            getMModel().setUserProfile(profileData);
        }
        getMModel().getIsMaster().set(z2);
        getMModel().getIsPopup().set(jsonObject.optInt("isPopup") == 1);
        JSONObject jSONObjectOptJSONObject5 = jsonObject.optJSONObject("setupData");
        PauseSliderData pauseSliderData = new PauseSliderData(null, false, null, null, 15, null);
        getMModel().getShowDancerCardOnScreen().set(jSONObjectOptJSONObject5 != null && jSONObjectOptJSONObject5.optInt("showDancerCardOnScreen") == 1);
        JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optJSONObject("gameplaySetup") : null;
        if (jSONObjectOptJSONObject6 != null) {
            getMModel().getShowPlayerList().set(false);
            getMModel().getStartGame().set(true);
            getNavigationItems().clear();
            JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject6.optJSONObject("pauseSlider");
            if (jSONObjectOptJSONObject7 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject7.optJSONArray("actions")) != null) {
                pauseSliderData.setTitle(jSONObjectOptJSONObject7.optString("title"));
                pauseSliderData.setEnabled(jSONObjectOptJSONObject7.optInt("isEnabled") == 1);
                pauseSliderData.setCommand(jSONArrayOptJSONArray.optJSONObject(0).optString("command"));
            }
            JDSocketHelper jDSocketHelper = JDSocketHelper.INSTANCE;
            String strOptString4 = jSONObjectOptJSONObject6.optString("coachImage");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
            pauseSliderData.setCoachImage(jDSocketHelper.getImagePath(strOptString4));
        } else {
            getMModel().getStartGame().set(false);
        }
        getMModel().setPauseSliderData(pauseSliderData);
        getMModel().refreshShowTouchArea();
        JustDanceControlSender.sendPhoneControl$default(JustDanceControlSender.INSTANCE, getMModel().getIsMaster().get(), getMModel().getDeviceShowTouchArea(), false, 4, null);
    }

    private final void handleSportData(boolean enabled) {
        this.enableAccelValuesSending = enabled;
    }

    private final void handleSyncEnd(JSONObject jsonObject, WebSocket webSocket) {
        this.socketDisconnected = false;
        getMModel().getConnectSuccess().set(true);
        String str = "{\"root\":{\"__class\": \"JD_PhoneDataCmdSyncEnd\", \"phoneID\": " + jsonObject.optInt("phoneID") + "}}";
        Logger.i(getTAG(), "sendSyncEnd: " + str);
        webSocket.send(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleTrigger$lambda$11(Function0 hasOngoingSport, JustDanceControlViewModel this$0, boolean z) {
        Intrinsics.checkNotNullParameter(hasOngoingSport, "$hasOngoingSport");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            hasOngoingSport.invoke();
        } else if (this$0.getMModel().getShowConnect().get() && !this$0.getMModel().getShowControl().get()) {
            this$0.getMModel().getShowConnect().set(false);
            this$0.getMModel().getShowControl().set(true);
            clb.a(ApplicationExtKt.getApplication());
            this$0.startSport();
        }
        return Unit.INSTANCE;
    }

    private final void handleUserProfile(JSONObject jsonObject) {
        ProfileData profileData = (ProfileData) getGson().fromJson(jsonObject.toString(), ProfileData.class);
        getMModel().setSweatMode(profileData.isSweatMode() == 1);
        this.playerId = profileData.getPlayerId();
        profileData.setImage(JDSocketHelper.INSTANCE.getImagePath(profileData.getImage()));
        if (profileData.isMasterPhone() == 1 && !this.showHomeOwner) {
            profileData.setName(profileData.getName() + ApplicationExtKt.getApplication().getString(c1j.U1));
            this.showHomeOwner = true;
        }
        JustDanceControlModel mModel = getMModel();
        Intrinsics.checkNotNull(profileData);
        mModel.setUserProfile(profileData);
        if (jsonObject.has("isMasterPhone")) {
            getMModel().getIsMaster().set(jsonObject.getInt("isMasterPhone") == 1);
            getMModel().refreshShowTouchArea();
            JustDanceControlSender.sendPhoneControl$default(JustDanceControlSender.INSTANCE, getMModel().getIsMaster().get(), getMModel().getDeviceShowTouchArea(), false, 4, null);
        }
    }

    private final void handleVibrate() {
        JustDanceControlSender.INSTANCE.sendPhoneControl(getMModel().getIsMaster().get(), getMModel().getDeviceShowTouchArea(), true);
        if (getMModel().getEnableVibrate().get()) {
            clb.a(ApplicationExtKt.getApplication());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JustDanceNavigationAdapter navigationAdapter_delegate$lambda$1() {
        return new JustDanceNavigationAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemBinding navigationBindings_delegate$lambda$2(JustDanceControlViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMModel().getNavigationBindings().bindExtra(nv1.l, this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JustDanceNavigationViewHolder navigationHolder$lambda$3(View view, int i) {
        Intrinsics.checkNotNull(view);
        return new JustDanceNavigationViewHolder(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableArrayList navigationItems_delegate$lambda$0() {
        return new ObservableArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JustDancePlayerAdapter playerDataAdapter_delegate$lambda$5() {
        return new JustDancePlayerAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemBinding playerDataBindings_delegate$lambda$6(JustDanceControlViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMModel().getPlayerDataBindings().bindExtra(nv1.l, this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableArrayList playerDataItems_delegate$lambda$4() {
        return new ObservableArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendHello(WebSocket webSocket) {
        this.socketDisconnected = false;
        Logger.i(getTAG(), "sendHello: {\"root\":{\"__class\": \"JD_PhoneDataCmdHandshakeHello\", \"clientVersion\": \"0.1\", \"accelAcquisitionFreqHz\": \"50\", \"accelAcquisitionLatency\": 200, \"accelMaxRange\": \"4.0\"}}");
        webSocket.send("{\"root\":{\"__class\": \"JD_PhoneDataCmdHandshakeHello\", \"clientVersion\": \"0.1\", \"accelAcquisitionFreqHz\": \"50\", \"accelAcquisitionLatency\": 200, \"accelMaxRange\": \"4.0\"}}");
    }

    private final void startSport() {
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        SportXmsHelperExtKt.getInstance(SportXmsHelper.INSTANCE).bindXmsService(ApplicationExtKt.getApplication(), new Function0() { // from class: kxd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceControlViewModel.startSport$lambda$12(this.f24391a, wearableDeviceModel);
            }
        }, new Function0() { // from class: lxd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceControlViewModel.startSport$lambda$13();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSport$lambda$12(JustDanceControlViewModel this$0, WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        this$0.startTimeStamp = System.currentTimeMillis();
        SportXmsHelperExtKt.getInstance(SportXmsHelper.INSTANCE).startSport(this$0.startTimeStamp, deviceModel.getDid());
        this$0.addSportListener();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSport$lambda$13() {
        JustDanceControlSender.INSTANCE.destroy();
        return Unit.INSTANCE;
    }

    public final void connectSwitch(@NotNull String ip, @NotNull String port, @NotNull final Function1<? super Integer, Unit> connect) {
        int i;
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(port, "port");
        Intrinsics.checkNotNullParameter(connect, "connect");
        try {
            i = Integer.parseInt(port);
        } catch (Exception e) {
            e.printStackTrace();
            i = 8080;
        }
        int i2 = i + 1;
        JDSocketHelper jDSocketHelper = JDSocketHelper.INSTANCE;
        jDSocketHelper.init(ip, String.valueOf(i2));
        String str = "wss://" + ip + ":" + i2 + CONNECT_PARAM;
        Logger.i(getTAG(), "connect: " + str);
        jDSocketHelper.createOkhttpClient().newWebSocket(new Request.Builder().url(str).build(), new WebSocketListener() { // from class: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel.connectSwitch.1
            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                super.onClosed(webSocket, code, reason);
                Logger.i(JustDanceControlViewModel.this.getTAG(), "onClosed code: " + code + " reason: " + reason);
                JustDanceControlViewModel.this.socketDisconnected = true;
                connect.invoke2(Integer.valueOf(code));
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(WebSocket webSocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                super.onClosing(webSocket, code, reason);
                Logger.i(JustDanceControlViewModel.this.getTAG(), "onClosing code: " + code + " reason: " + reason);
                if (code != 1000) {
                    JustDanceControlViewModel.this.destroyWebSocket();
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t, "t");
                super.onFailure(webSocket, t, response);
                t.printStackTrace();
                Logger.e(JustDanceControlViewModel.this.getTAG(), "onFailure throwable: " + t.getMessage() + " response: " + response);
                JustDanceControlViewModel.this.socketDisconnected = true;
                JustDanceControlSender.INSTANCE.destroy();
                JustDanceControlViewModel.this.destroyWebSocket();
                connect.invoke2(-1);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String text) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                super.onMessage(webSocket, text);
                Logger.i(JustDanceControlViewModel.this.getTAG(), "onMessage: " + text);
                JustDanceControlViewModel.this.handleReceive(text, webSocket);
            }

            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                super.onOpen(webSocket, response);
                JustDanceControlViewModel.this.webSocket = webSocket;
                Logger.i(JustDanceControlViewModel.this.getTAG(), "onOpen");
                JustDanceControlViewModel.this.sendHello(webSocket);
                connect.invoke2(0);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, ByteString bytes) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                super.onMessage(webSocket, bytes);
                String tag = JustDanceControlViewModel.this.getTAG();
                String string = Arrays.toString(bytes.toByteArray());
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                Logger.i(tag, "onMessage: " + string);
            }
        });
    }

    public final void destroyWebSocket() {
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            webSocket.close(1000, "");
        }
        this.webSocket = null;
        JDSocketHelper.INSTANCE.destroyOkhttpClient();
    }

    @NotNull
    public final JustDanceNavigationAdapter getNavigationAdapter() {
        return (JustDanceNavigationAdapter) this.navigationAdapter.getValue();
    }

    @NotNull
    public final ItemBinding<PhoneActionNavigation> getNavigationBindings() {
        return (ItemBinding) this.navigationBindings.getValue();
    }

    @NotNull
    public final Function2<View, Integer, BaseViewHolder<PhoneActionNavigation>> getNavigationHolder() {
        return this.navigationHolder;
    }

    @NotNull
    public final ObservableArrayList<PhoneActionNavigation> getNavigationItems() {
        return (ObservableArrayList) this.navigationItems.getValue();
    }

    @NotNull
    public final JustDancePlayerAdapter getPlayerDataAdapter() {
        return (JustDancePlayerAdapter) this.playerDataAdapter.getValue();
    }

    @NotNull
    public final ItemBinding<PlayerData> getPlayerDataBindings() {
        return (ItemBinding) this.playerDataBindings.getValue();
    }

    @NotNull
    public final ObservableArrayList<PlayerData> getPlayerDataItems() {
        return (ObservableArrayList) this.playerDataItems.getValue();
    }

    @NotNull
    public final MutableLiveData<Long> getRecordEmitter() {
        return this.recordEmitter;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "JustDanceControlViewModel";
    }

    public final void handleTrigger(@NotNull final Function0<Unit> hasOngoingSport) {
        Intrinsics.checkNotNullParameter(hasOngoingSport, "hasOngoingSport");
        JustDanceControlSender.INSTANCE.checkSportDoing(new Function1() { // from class: hxd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceControlViewModel.handleTrigger$lambda$11(hasOngoingSport, this, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void sendCmd(@Nullable String text) {
        WebSocket webSocket;
        if (text == null || text.length() == 0 || (webSocket = this.webSocket) == null) {
            return;
        }
        webSocket.send(text);
    }

    public final void sendKeyBoardText(@Nullable String text) {
        if (text == null) {
            return;
        }
        sendCmd("{\"root\":{\"__class\": \"JD_SubmitKeyboard_PhoneCommandData\", \"keyboardOutput\": \"" + text + "\"}}");
        getMModel().getIsUseKeyBoard().set(false);
        getMModel().refreshShowTouchArea();
    }

    public final void stopSport() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        SportXmsHelperExtKt.getInstance(SportXmsHelper.INSTANCE).finishSport(wearableDeviceModel.getDid());
    }
}
