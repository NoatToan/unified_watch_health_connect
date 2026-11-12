package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.l;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyInfoFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment;
import com.xiaomi.fitness.devicesettings.common.contact.ContactsListActivity;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.av6;
import defpackage.bw1;
import defpackage.eg4;
import defpackage.eui;
import defpackage.jni;
import defpackage.mg6;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\b\u0007\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001@B\u0007¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J?\u0010\u000f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0014¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u001eJ)\u0010+\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u00108\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\t098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListViewModel;", "Lmg6;", "", "setEndViewNormal", "()V", "setEndViewEdit", "", "Leg4;", "list", "savedList", "Lkotlin/Function1;", "", HuamiUpgradeFragment.DONE_TAG, "syncMIUIAfterChange", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "index", "insertByOrder", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByOrder", "requestSyncMIUISosContacts", "", "did", "contacts", "showSyncMIUISosContactsDialog", "(Ljava/lang/String;Ljava/util/List;)V", "trySetEmergencyContactList", "checkContentChange", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "onBackPressed", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListAdapter;", "adapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListAdapter;", "Landroidx/recyclerview/widget/l;", "mItemTouchHelper", "Landroidx/recyclerview/widget/l;", "sosContactSwitchOn", "Z", "fallDetectionSwitchOn", "callMedicalSwitchOn", "supportSyncMIUIContacts", "agreeSyncMIUISosContacts", "", "originList", "Ljava/util/List;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEmergencyContactListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyContactListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,346:1\n1#2:347\n37#3:348\n36#3,3:349\n*S KotlinDebug\n*F\n+ 1 EmergencyContactListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListFragment\n*L\n153#1:348\n153#1:349,3\n*E\n"})
public final class EmergencyContactListFragment extends Hilt_EmergencyContactListFragment<EmergencyContactListViewModel, mg6> {

    @NotNull
    private static final String TAG = "EmergencyContactListFragment";

    @Nullable
    private EmergencyContactListAdapter adapter;
    private boolean agreeSyncMIUISosContacts;
    private boolean callMedicalSwitchOn;
    private boolean fallDetectionSwitchOn;

    @Nullable
    private l mItemTouchHelper;

    @NotNull
    private List<eg4> originList;
    private boolean sosContactSwitchOn;
    private boolean supportSyncMIUIContacts;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$deleteByOrder$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment", f = "EmergencyContactListFragment.kt", i = {0, 0, 0, 0}, l = {200, 203}, m = "deleteByOrder", n = {"this", "list", "contactInfo", "index"}, s = {"L$0", "L$1", "L$2", "I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmergencyContactListFragment.this.deleteByOrder(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$insertByOrder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment", f = "EmergencyContactListFragment.kt", i = {0, 0, 0, 0}, l = {SportReportBaseParser.ReportType.minWaterTemperature, SportReportBaseParser.ReportType.divingCNS}, m = "insertByOrder", n = {"this", "list", "contactInfo", "index"}, s = {"L$0", "L$1", "L$2", "I$0"})
    public static final class C20591 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C20591(Continuation<? super C20591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmergencyContactListFragment.this.insertByOrder(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$onActivityResult$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$onActivityResult$2", f = "EmergencyContactListFragment.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nEmergencyContactListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyContactListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListFragment$onActivityResult$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,346:1\n37#2:347\n36#2,3:348\n*S KotlinDebug\n*F\n+ 1 EmergencyContactListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListFragment$onActivityResult$2\n*L\n240#1:347\n240#1:348,3\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $nameText;
        final /* synthetic */ String $numberText;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$nameText = str;
            this.$numberText = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(List list) {
            String string = Arrays.toString(list != null ? (eg4[]) list.toArray(new eg4[0]) : null);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Logger.i(EmergencyContactListFragment.TAG, "insert one result: " + string);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmergencyContactListFragment.this.new AnonymousClass2(this.$nameText, this.$numberText, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EmergencyContactListViewModel emergencyContactListViewModelAccess$getMViewModel = EmergencyContactListFragment.access$getMViewModel(EmergencyContactListFragment.this);
                String str = this.$nameText;
                String str2 = this.$numberText;
                this.label = 1;
                obj = emergencyContactListViewModelAccess$getMViewModel.insertMIUISosContacts(str, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(EmergencyContactListFragment.TAG, "insert one: " + this.$numberText + " result: " + zBooleanValue);
            EmergencyContactListFragment.access$getMViewModel(EmergencyContactListFragment.this).supportSyncMIUISosContacts(new Function1() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return EmergencyContactListFragment.AnonymousClass2.invokeSuspend$lambda$0((List) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$requestSyncMIUISosContacts$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$requestSyncMIUISosContacts$1", f = "EmergencyContactListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nEmergencyContactListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyContactListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListFragment$requestSyncMIUISosContacts$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,346:1\n37#2:347\n36#2,3:348\n*S KotlinDebug\n*F\n+ 1 EmergencyContactListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListFragment$requestSyncMIUISosContacts$1\n*L\n263#1:347\n263#1:348,3\n*E\n"})
    public static final class C20601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ int $size;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20601(int i, String str, Continuation<? super C20601> continuation) {
            super(2, continuation);
            this.$size = i;
            this.$did = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(EmergencyContactListFragment emergencyContactListFragment, int i, String str, List list) {
            String string = Arrays.toString(list != null ? (eg4[]) list.toArray(new eg4[0]) : null);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Logger.i(EmergencyContactListFragment.TAG, "miui sos contacts: " + string);
            if (list != null) {
                emergencyContactListFragment.supportSyncMIUIContacts = true;
                if (!emergencyContactListFragment.agreeSyncMIUISosContacts && i == 0) {
                    AnyExtKt.main$default(null, new EmergencyContactListFragment$requestSyncMIUISosContacts$1$1$1(emergencyContactListFragment, str, list, null), 1, null);
                } else if (emergencyContactListFragment.agreeSyncMIUISosContacts && (!list.isEmpty())) {
                    AnyExtKt.main$default(null, new EmergencyContactListFragment$requestSyncMIUISosContacts$1$1$2(list, emergencyContactListFragment, null), 1, null);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmergencyContactListFragment.this.new C20601(this.$size, this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EmergencyContactListViewModel emergencyContactListViewModelAccess$getMViewModel = EmergencyContactListFragment.access$getMViewModel(EmergencyContactListFragment.this);
            final EmergencyContactListFragment emergencyContactListFragment = EmergencyContactListFragment.this;
            final int i = this.$size;
            final String str = this.$did;
            emergencyContactListViewModelAccess$getMViewModel.supportSyncMIUISosContacts(new Function1() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return EmergencyContactListFragment.C20601.invokeSuspend$lambda$0(emergencyContactListFragment, i, str, (List) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$syncMIUIAfterChange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$syncMIUIAfterChange$1", f = "EmergencyContactListFragment.kt", i = {}, l = {174, 175}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nEmergencyContactListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyContactListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListFragment$syncMIUIAfterChange$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,346:1\n37#2:347\n36#2,3:348\n*S KotlinDebug\n*F\n+ 1 EmergencyContactListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/EmergencyContactListFragment$syncMIUIAfterChange$1\n*L\n177#1:347\n177#1:348,3\n*E\n"})
    public static final class C20621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $done;
        final /* synthetic */ List<eg4> $list;
        final /* synthetic */ List<eg4> $savedList;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$syncMIUIAfterChange$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$syncMIUIAfterChange$1$2", f = "EmergencyContactListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $done;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$done = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$done, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$done.invoke2(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20621(List<eg4> list, List<eg4> list2, Function1<? super Boolean, Unit> function1, Continuation<? super C20621> continuation) {
            super(2, continuation);
            this.$savedList = list;
            this.$list = list2;
            this.$done = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(List list) {
            String string = Arrays.toString(list != null ? (eg4[]) list.toArray(new eg4[0]) : null);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Logger.i(EmergencyContactListFragment.TAG, "finish: " + string);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmergencyContactListFragment.this.new C20621(this.$savedList, this.$list, this.$done, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                EmergencyContactListFragment.access$getMViewModel(EmergencyContactListFragment.this).supportSyncMIUISosContacts(new Function1() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.c
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return EmergencyContactListFragment.C20621.invokeSuspend$lambda$0((List) obj2);
                    }
                });
                AnyExtKt.main$default(null, new AnonymousClass2(this.$done, null), 1, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            EmergencyContactListFragment emergencyContactListFragment = EmergencyContactListFragment.this;
            List<eg4> list = this.$savedList;
            this.label = 1;
            if (emergencyContactListFragment.deleteByOrder(0, list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            EmergencyContactListFragment emergencyContactListFragment2 = EmergencyContactListFragment.this;
            List<eg4> list2 = this.$list;
            this.label = 2;
            if (emergencyContactListFragment2.insertByOrder(0, list2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            EmergencyContactListFragment.access$getMViewModel(EmergencyContactListFragment.this).supportSyncMIUISosContacts(new Function1() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return EmergencyContactListFragment.C20621.invokeSuspend$lambda$0((List) obj2);
                }
            });
            AnyExtKt.main$default(null, new AnonymousClass2(this.$done, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public EmergencyContactListFragment() {
        super(eui.a0, bw1.f);
        this.originList = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ EmergencyContactListViewModel access$getMViewModel(EmergencyContactListFragment emergencyContactListFragment) {
        return (EmergencyContactListViewModel) emergencyContactListFragment.getMViewModel();
    }

    private final boolean checkContentChange() {
        if (this.originList.size() == 0 && FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList().size() == 0) {
            return false;
        }
        if (this.originList.size() != FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList().size()) {
            return true;
        }
        int size = this.originList.size();
        for (int i = 0; i < size; i++) {
            eg4 eg4Var = this.originList.get(i);
            eg4 eg4Var2 = FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList().get(i);
            if (!Intrinsics.areEqual(eg4Var.c, eg4Var2.c) || !Intrinsics.areEqual(eg4Var.d, eg4Var2.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object deleteByOrder(int i, List<eg4> list, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        EmergencyContactListFragment emergencyContactListFragment;
        List<eg4> list2;
        eg4 eg4Var;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                i = anonymousClass1.I$0;
                eg4Var = (eg4) anonymousClass1.L$2;
                list2 = (List) anonymousClass1.L$1;
                emergencyContactListFragment = (EmergencyContactListFragment) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        eg4 eg4Var2 = list.get(i);
        EmergencyContactListViewModel emergencyContactListViewModel = (EmergencyContactListViewModel) getMViewModel();
        String number = eg4Var2.d;
        Intrinsics.checkNotNullExpressionValue(number, "number");
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = list;
        anonymousClass1.L$2 = eg4Var2;
        anonymousClass1.I$0 = i;
        anonymousClass1.label = 1;
        Object objDeleteMIUISosContacts = emergencyContactListViewModel.deleteMIUISosContacts(number, anonymousClass1);
        if (objDeleteMIUISosContacts == coroutine_suspended) {
            return coroutine_suspended;
        }
        emergencyContactListFragment = this;
        list2 = list;
        eg4Var = eg4Var2;
        obj = objDeleteMIUISosContacts;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Logger.i(TAG, "deleteByOrder index: " + i + " info: " + eg4Var + " ");
        if (!zBooleanValue || i >= list2.size() - 1) {
            return Unit.INSTANCE;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
        if (emergencyContactListFragment.deleteByOrder(i + 1, list2, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object insertByOrder(int i, List<eg4> list, Continuation<? super Unit> continuation) {
        C20591 c20591;
        EmergencyContactListFragment emergencyContactListFragment;
        List<eg4> list2;
        eg4 eg4Var;
        if (continuation instanceof C20591) {
            c20591 = (C20591) continuation;
            int i2 = c20591.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c20591.label = i2 - Integer.MIN_VALUE;
            } else {
                c20591 = new C20591(continuation);
            }
        } else {
            c20591 = new C20591(continuation);
        }
        Object obj = c20591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c20591.label;
        if (i3 != 0) {
            if (i3 == 1) {
                i = c20591.I$0;
                eg4Var = (eg4) c20591.L$2;
                list2 = (List) c20591.L$1;
                emergencyContactListFragment = (EmergencyContactListFragment) c20591.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        eg4 eg4Var2 = list.get(i);
        EmergencyContactListViewModel emergencyContactListViewModel = (EmergencyContactListViewModel) getMViewModel();
        String name = eg4Var2.c;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        String number = eg4Var2.d;
        Intrinsics.checkNotNullExpressionValue(number, "number");
        c20591.L$0 = this;
        c20591.L$1 = list;
        c20591.L$2 = eg4Var2;
        c20591.I$0 = i;
        c20591.label = 1;
        Object objInsertMIUISosContacts = emergencyContactListViewModel.insertMIUISosContacts(name, number, c20591);
        if (objInsertMIUISosContacts == coroutine_suspended) {
            return coroutine_suspended;
        }
        emergencyContactListFragment = this;
        list2 = list;
        eg4Var = eg4Var2;
        obj = objInsertMIUISosContacts;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Logger.i(TAG, "insertByOrder index: " + i + " info: " + eg4Var + " ");
        if (!zBooleanValue || i >= list2.size() - 1) {
            return Unit.INSTANCE;
        }
        c20591.L$0 = null;
        c20591.L$1 = null;
        c20591.L$2 = null;
        c20591.label = 2;
        if (emergencyContactListFragment.insertByOrder(i + 1, list2, c20591) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$0(EmergencyContactListFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((mg6) this$0.getMBinding()).D.setEnabled(i < 3);
        ((mg6) this$0.getMBinding()).A.setEnabled(i < 3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(EmergencyContactListFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, bool.booleanValue() ? wzi.common_set_success : wzi.common_set_error);
        }
        this$0.originList = CollectionsKt___CollectionsKt.toMutableList((Collection) FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList());
        return Unit.INSTANCE;
    }

    private final void requestSyncMIUISosContacts() {
        String did;
        int size = FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList().size();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            return;
        }
        DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
        boolean agreeSyncMIUISosContacts = deviceSettingsPreference.getAgreeSyncMIUISosContacts(did);
        this.agreeSyncMIUISosContacts = agreeSyncMIUISosContacts;
        Logger.i(TAG, "agreeSyncMIUISosContacts: " + agreeSyncMIUISosContacts);
        if (deviceSettingsPreference.getDisableSyncMIUISosContacts(did)) {
            return;
        }
        Logger.i(TAG, "never reject sync miui sos");
        AnyExtKt.io$default(null, new C20601(size, did, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEndViewEdit() {
        LinearLayout bottomContainer = ((mg6) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(bottomContainer, "bottomContainer");
        ViewExtKt.gone(bottomContainer);
        View endView$default = IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f0, null, new View.OnClickListener() { // from class: s78
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmergencyContactListFragment.setEndViewEdit$lambda$11(this.f33367a, view);
            }
        }, 5, null);
        if (endView$default != null) {
            endView$default.setContentDescription(getString(wzi.T6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEndViewEdit$lambda$11(final EmergencyContactListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EmergencyContactListAdapter emergencyContactListAdapter = this$0.adapter;
        if (emergencyContactListAdapter != null) {
            emergencyContactListAdapter.setEditMode();
        }
        EmergencyContactListAdapter emergencyContactListAdapter2 = this$0.adapter;
        if (emergencyContactListAdapter2 != null) {
            emergencyContactListAdapter2.save(new Function2() { // from class: z78
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmergencyContactListFragment.setEndViewEdit$lambda$11$lambda$10(this.f40977a, (List) obj, (List) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEndViewEdit$lambda$11$lambda$10(final EmergencyContactListFragment this$0, List oldList, List newList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        if (oldList.size() == 0) {
            Logger.i(TAG, "SOS联系人，旧列表为空");
            this$0.setEndViewNormal();
            return Unit.INSTANCE;
        }
        String string = Arrays.toString(newList.toArray(new eg4[0]));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.i(TAG, "sync miui: " + string);
        this$0.syncMIUIAfterChange(newList, oldList, new Function1() { // from class: v78
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EmergencyContactListFragment.setEndViewEdit$lambda$11$lambda$10$lambda$9(this.f36583a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEndViewEdit$lambda$11$lambda$10$lambda$9(EmergencyContactListFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.trySetEmergencyContactList();
        this$0.setEndViewNormal();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEndViewNormal() {
        LinearLayout bottomContainer = ((mg6) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(bottomContainer, "bottomContainer");
        ViewExtKt.visible(bottomContainer);
        View endView$default = IActionBar.DefaultImpls.setEndView$default(this, 0, jni.X, null, new View.OnClickListener() { // from class: u78
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmergencyContactListFragment.setEndViewNormal$lambda$8(this.f35488a, view);
            }
        }, 5, null);
        if (endView$default != null) {
            endView$default.setContentDescription(getString(wzi.common_edit));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEndViewNormal$lambda$8(EmergencyContactListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EmergencyContactListAdapter emergencyContactListAdapter = this$0.adapter;
        if (emergencyContactListAdapter != null) {
            emergencyContactListAdapter.setEditMode();
        }
        this$0.setEndViewEdit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(EmergencyContactListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList().size() < 3) {
            BaseFragmentExKt.gotoPageForResult(this$0, EmergencyContactAddFragment.class, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(final EmergencyContactListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList().size() < 3) {
            PermissionExtKt.permission(this$0, "android.permission.READ_CONTACTS", this$0.getString(wzi.ef), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: w78
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EmergencyContactListFragment.setListener$lambda$7$lambda$6(this.f37681a, (PermissionBuilder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$7$lambda$6(final EmergencyContactListFragment this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: r78
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EmergencyContactListFragment.setListener$lambda$7$lambda$6$lambda$4(this.f32283a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: t78
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EmergencyContactListFragment.setListener$lambda$7$lambda$6$lambda$5(this.f34405a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$7$lambda$6$lambda$4(EmergencyContactListFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) ContactsListActivity.class);
        intent.putExtra(ContactsListActivity.CONTACT_LIST_TITLE, this$0.getString(wzi.t7));
        this$0.startActivityForResult(intent, 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$7$lambda$6$lambda$5(EmergencyContactListFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        PermissionsUtil.showSettingDialog$default(permissionsUtil, mActivity, "android.permission.READ_CONTACTS", false, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSyncMIUISosContactsDialog(final String did, final List<eg4> contacts) {
        new CommonDialog.c("requestSyncMIUISosContacts").setDialogTitle(wzi.y7).setDialogDescription(wzi.x7).setPositiveText(wzi.common_allow).setNegativeText(wzi.common_reject).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment.showSyncMIUISosContactsDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    this.agreeSyncMIUISosContacts = false;
                    DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
                    deviceSettingsPreference.setAgreeSyncMIUISosContacts(did, false);
                    deviceSettingsPreference.setDisableSyncMIUISosContacts(did, true);
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                DeviceSettingsPreference.INSTANCE.setAgreeSyncMIUISosContacts(did, true);
                this.agreeSyncMIUISosContacts = true;
                FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList().addAll(contacts);
                EmergencyContactListAdapter emergencyContactListAdapter = this.adapter;
                if (emergencyContactListAdapter != null) {
                    emergencyContactListAdapter.updateList(contacts);
                }
                this.trySetEmergencyContactList();
            }
        }).showIfNeed(getParentFragmentManager());
    }

    private final void syncMIUIAfterChange(List<eg4> list, List<eg4> savedList, Function1<? super Boolean, Unit> done) {
        if (!this.supportSyncMIUIContacts || !this.agreeSyncMIUISosContacts) {
            done.invoke2(Boolean.FALSE);
            return;
        }
        try {
            AnyExtKt.io$default(null, new C20621(savedList, list, done, null), 1, null);
        } catch (Exception e) {
            e.printStackTrace();
            done.invoke2(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void trySetEmergencyContactList() {
        if (checkContentChange()) {
            ((EmergencyContactListViewModel) getMViewModel()).syncSosContactInfo(this.sosContactSwitchOn, this.fallDetectionSwitchOn, this.callMedicalSwitchOn, FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList());
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.a0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Object next;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            if (requestCode == 1 || requestCode == 2) {
                String stringExtra = data != null ? data.getStringExtra(EmergencyInfoFragment.EMERGENCY_INFO_REMARK_EXTRA) : null;
                String stringExtra2 = data != null ? data.getStringExtra(EmergencyInfoFragment.EMERGENCY_INFO_NUMBER_EXTRA) : null;
                if (stringExtra == null || stringExtra.length() == 0 || stringExtra2 == null || stringExtra2.length() == 0) {
                    return;
                }
                Iterator<T> it = FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((eg4) next).d, stringExtra2));
                if (next != null) {
                    Context context = getContext();
                    if (context != null) {
                        ToastExtKt.toastShort(context, wzi.u7);
                        return;
                    }
                    return;
                }
                eg4 eg4Var = new eg4();
                eg4Var.c = stringExtra;
                eg4Var.d = stringExtra2;
                FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
                fallDetectionHelper.getSLocalEmergencyContactList().add(eg4Var);
                EmergencyContactListAdapter emergencyContactListAdapter = this.adapter;
                if (emergencyContactListAdapter != null) {
                    emergencyContactListAdapter.updateList(fallDetectionHelper.getSLocalEmergencyContactList());
                }
                if (this.supportSyncMIUIContacts && this.agreeSyncMIUISosContacts) {
                    AnyExtKt.main$default(null, new AnonymousClass2(stringExtra, stringExtra2, null), 1, null);
                }
                trySetEmergencyContactList();
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        EmergencyContactListAdapter emergencyContactListAdapter = this.adapter;
        if (emergencyContactListAdapter == null || !emergencyContactListAdapter.getEditMode()) {
            return super.onBackPressed();
        }
        EmergencyContactListAdapter emergencyContactListAdapter2 = this.adapter;
        if (emergencyContactListAdapter2 != null) {
            emergencyContactListAdapter2.setEditMode();
        }
        EmergencyContactListAdapter emergencyContactListAdapter3 = this.adapter;
        if (emergencyContactListAdapter3 != null) {
            emergencyContactListAdapter3.reset();
        }
        setEndViewNormal();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.w7);
        Bundle arguments = getArguments();
        this.sosContactSwitchOn = arguments != null ? arguments.getBoolean(EmergencyContactListFragmentKt.KEY_EMERGENCY_CONTACT_SWITCH) : false;
        Bundle arguments2 = getArguments();
        this.fallDetectionSwitchOn = arguments2 != null ? arguments2.getBoolean(EmergencyContactListFragmentKt.KEY_FALL_DETECTION_SWITCH) : false;
        Bundle arguments3 = getArguments();
        boolean z = arguments3 != null ? arguments3.getBoolean(EmergencyContactListFragmentKt.KEY_CALL_MEDICAL_SWITCH) : false;
        this.callMedicalSwitchOn = z;
        Logger.i(TAG, "sosContactSwitchOn: " + this.sosContactSwitchOn + " fallDetectionSwitchOn: " + this.fallDetectionSwitchOn + " callMedicalSwitchOn: " + z);
        this.adapter = new EmergencyContactListAdapter();
        ((mg6) getMBinding()).E.setAdapter(this.adapter);
        ((mg6) getMBinding()).E.setLayoutManager(new LinearLayoutManager(getContext()));
        EmergencyContactListAdapter emergencyContactListAdapter = this.adapter;
        Intrinsics.checkNotNull(emergencyContactListAdapter);
        l itemTouchHelper = emergencyContactListAdapter.getItemTouchHelper();
        this.mItemTouchHelper = itemTouchHelper;
        if (itemTouchHelper != null) {
            itemTouchHelper.d(((mg6) getMBinding()).E);
        }
        EmergencyContactListAdapter emergencyContactListAdapter2 = this.adapter;
        if (emergencyContactListAdapter2 != null) {
            emergencyContactListAdapter2.setOnEmergencyContactCountChange(new Function1() { // from class: x78
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EmergencyContactListFragment.onViewCreated$lambda$0(this.f38781a, ((Integer) obj).intValue());
                }
            });
        }
        EmergencyContactListAdapter emergencyContactListAdapter3 = this.adapter;
        if (emergencyContactListAdapter3 != null) {
            emergencyContactListAdapter3.updateList(FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList());
        }
        ((EmergencyContactListViewModel) getMViewModel()).getSetResult().observe(getViewLifecycleOwner(), new EmergencyContactListFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: y78
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EmergencyContactListFragment.onViewCreated$lambda$1(this.f39885a, (Boolean) obj);
            }
        }));
        AppUtil appUtil = AppUtil.INSTANCE;
        boolean zIsPlayChannel = appUtil.isPlayChannel();
        SystemProperties systemProperties = SystemProperties.INSTANCE;
        Logger.i(TAG, "channel: " + zIsPlayChannel + " global: " + systemProperties.isGlobalMiuiRom());
        this.originList = CollectionsKt___CollectionsKt.toMutableList((Collection) FallDetectionHelper.INSTANCE.getSLocalEmergencyContactList());
        if (appUtil.isPlayChannel() || systemProperties.isGlobalMiuiRom()) {
            return;
        }
        requestSyncMIUISosContacts();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((mg6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: a88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmergencyContactListFragment.setListener$lambda$2(this.f760a, view);
            }
        });
        ((mg6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: b88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmergencyContactListFragment.setListener$lambda$7(this.f3915a, view);
            }
        });
        setEndViewNormal();
    }
}
