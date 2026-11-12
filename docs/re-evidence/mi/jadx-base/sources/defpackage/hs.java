package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J7\u0010\u0005\u001a\u00020\u000b2\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\fJ2\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u0001`\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016JI\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u0001`\t2\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0012J=\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00072\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0017J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\bH\u0002J8\u0010\u0005\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00072\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0015H\u0002R\"\u0010\u0019\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0005\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lhs;", "Lyi;", "Lds;", "settingsInterceptor", "", PluginDeviceInfo.FMODEL, "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "setting", "", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cmd", "needDesc", "", "groupType", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "fieldList", "(ZLcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj2;", "bleProvider", "Lj2;", "()Lj2;", "setBleProvider", "(Lj2;)V", "<init>", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class hs implements yi {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public j2 f20388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ds f20389b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lhs$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2", f = "SettingsV2.kt", i = {0}, l = {114}, m = "queryField", n = {"groupType"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return hs.this.a(false, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2", f = "SettingsV2.kt", i = {0, 0, 0, 0}, l = {101}, m = "querySettings", n = {"this", "hashMap", "$this$forEach$iv", "needDesc"}, s = {"L$0", "L$1", "L$2", "Z$0"})
    public static final class c extends ContinuationImpl {
        public int B;
        public Object t;
        public Object u;
        public Object v;
        public boolean w;
        public int x;
        public int y;
        public /* synthetic */ Object z;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return hs.this.a(false, (SettingsGroupType[]) null, (Continuation<? super HashMap<SettingsGroupType, Settings>>) this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2", f = "SettingsV2.kt", i = {0, 0, 1, 1, 1}, l = {48, 54}, m = "writeSetting", n = {"this", "setting", "this", "result", "it"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3"})
    public static final class d extends ContinuationImpl {
        public int A;
        public Object t;
        public Object u;
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.y = obj;
            this.A |= Integer.MIN_VALUE;
            return hs.this.a((HashMap<SettingsGroupType, Settings>) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "interceptor: " + hs.this.f20389b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f t = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "init group version failed!";
        }
    }

    public hs(@NotNull j2 bleProvider) {
        Intrinsics.checkNotNullParameter(bleProvider, "bleProvider");
        this.f20388a = bleProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public j2 getF20388a() {
        return this.f20388a;
    }

    public void a(@NotNull ByteBuffer byteBuffer, @NotNull HashMap<SettingsGroupType, Settings> map) {
        yi.a.a(this, byteBuffer, map);
    }

    public final void a(@NotNull ds settingsInterceptor) {
        Intrinsics.checkNotNullParameter(settingsInterceptor, "settingsInterceptor");
        this.f20389b = settingsInterceptor;
    }

    public final byte[] a(Settings setting) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(5);
            byteArrayOutputStream.write(setting.toByteArray());
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            t5t.d("SettingsV2", "assembleSettingCmd, e: " + e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ef -> B:45:0x00f0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.yi
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.util.HashMap<com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType, com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs.a(java.util.HashMap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.yi
    @Nullable
    public HashMap<SettingsGroupType, Settings> a(@Nullable byte[] cmd) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        ByteBuffer byteBuffer = ByteBuffer.wrap(cmd);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byte b2 = byteBuffer.get();
        if (b2 != 4) {
            t5t.d("SettingsV2", "type mismatch! " + ((int) b2));
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
        bs bsVarP = z2.p(byteBuffer);
        if (bsVarP != bs.SUCCESS) {
            t5t.d("SettingsV2", "code error: " + bsVarP);
            return null;
        }
        a(byteBuffer, map);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b7 -> B:23:0x00bd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.yi
    @org.jetbrains.annotations.Nullable
    public java.lang.Object a(boolean r20, @org.jetbrains.annotations.NotNull com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType[] r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.HashMap<com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType, com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings>> r22) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs.a(boolean, com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yi
    @Nullable
    public Object a(boolean z, @NotNull SettingsGroupType settingsGroupType, @NotNull ArrayList<Integer> arrayList, @NotNull Continuation<? super Settings> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.w = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objQuerySettings = bVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.w;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuerySettings);
            t5t.d("SettingsV2", "queryField: " + settingsGroupType + ", fieldList:" + arrayList);
            j2 f20388a = getF20388a();
            byte[] bArrA = a(z, settingsGroupType, arrayList);
            bVar.t = settingsGroupType;
            bVar.w = 1;
            objQuerySettings = f20388a.querySettings(bArrA, bVar);
            if (objQuerySettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            settingsGroupType = (SettingsGroupType) bVar.t;
            ResultKt.throwOnFailure(objQuerySettings);
        }
        HashMap map = (HashMap) objQuerySettings;
        if (map != null) {
            return (Settings) map.get(settingsGroupType);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ byte[] a(hs hsVar, boolean z, SettingsGroupType settingsGroupType, ArrayList arrayList, int i, Object obj) {
        if ((i & 4) != 0) {
            arrayList = null;
        }
        return hsVar.a(z, settingsGroupType, (ArrayList<Integer>) arrayList);
    }

    public final byte[] a(boolean needDesc, SettingsGroupType groupType, ArrayList<Integer> fieldList) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(c3.a(needDesc));
            byteArrayOutputStream.write(groupType.getValue());
            if (fieldList != null && !fieldList.isEmpty()) {
                byteArrayOutputStream.write(fieldList.size());
                Iterator<T> it = fieldList.iterator();
                while (it.hasNext()) {
                    byteArrayOutputStream.write(((Number) it.next()).intValue());
                }
            } else {
                byteArrayOutputStream.write(0);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            t5t.d("SettingsV2", "assembleSettingCmd: " + e2);
            return null;
        }
    }
}
