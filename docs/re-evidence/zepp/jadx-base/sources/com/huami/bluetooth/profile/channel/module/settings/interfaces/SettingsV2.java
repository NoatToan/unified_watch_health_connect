package com.huami.bluetooth.profile.channel.module.settings.interfaces;

import com.huami.bluetooth.profile.channel.module.settings.SettingsError;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010$\u001a\u00020\u001e¢\u0006\u0004\b'\u0010#J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fH\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ7\u0010\u0015\u001a\u00020\u00062\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0013j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002`\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0016JI\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00142\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/SettingsV2;", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/ISettings;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "setting", "", "c", "", "needDesc", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "fieldList", "a", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/SettingsInterceptor;", "settingsInterceptor", "", "setInterceptor", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "writeSetting", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constant.h, "parseSettings", "", "querySettings", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryField", "(ZLcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;", "getBleProvider", "()Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;", "setBleProvider", "(Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;)V", "bleProvider", "b", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/SettingsInterceptor;", "<init>", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SettingsV2 implements ISettings {

    @NotNull
    private static final String c = "SettingsV2";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private BleProvider bleProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private SettingsInterceptor settingsInterceptor;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2", f = "SettingsV2.kt", i = {0}, l = {114}, m = "queryField", n = {"groupType"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SettingsV2.this.queryField(false, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2", f = "SettingsV2.kt", i = {0}, l = {101}, m = "querySettings", n = {"hashMap"}, s = {"L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public boolean d;
        public int e;
        public int f;
        public /* synthetic */ Object g;
        public int i;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return SettingsV2.this.querySettings(false, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2", f = "SettingsV2.kt", i = {1, 1}, l = {48, 54}, m = "writeSetting", n = {"result", "it"}, s = {"L$1", "L$3"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return SettingsV2.this.writeSetting(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("interceptor: ", SettingsV2.this.settingsInterceptor);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init group version failed!";
        }
    }

    public SettingsV2(@NotNull BleProvider bleProvider) {
        this.bleProvider = bleProvider;
    }

    private final byte[] a(boolean needDesc, SettingsGroupType groupType, ArrayList<Integer> fieldList) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(ByteUtilsKt.toByte(needDesc));
            byteArrayOutputStream.write(groupType.getValue());
            if (fieldList == null || fieldList.isEmpty()) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(fieldList.size());
                Iterator<T> it2 = fieldList.iterator();
                while (it2.hasNext()) {
                    byteArrayOutputStream.write(((Number) it2.next()).intValue());
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            Debug.fi(c, Intrinsics.stringPlus("assembleSettingCmd: ", e2));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ byte[] b(SettingsV2 settingsV2, boolean z, SettingsGroupType settingsGroupType, ArrayList arrayList, int i, Object obj) {
        if ((i & 4) != 0) {
            arrayList = null;
        }
        return settingsV2.a(z, settingsGroupType, arrayList);
    }

    private final byte[] c(Settings setting) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(5);
            byteArrayOutputStream.write(setting.toByteArray());
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            Debug.fi(c, Intrinsics.stringPlus("assembleSettingCmd, e: ", e2));
            return null;
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    @NotNull
    public BleProvider getBleProvider() {
        return this.bleProvider;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    public void parse(@NotNull ByteBuffer byteBuffer, @NotNull HashMap<SettingsGroupType, Settings> map) {
        ISettings.DefaultImpls.parse(this, byteBuffer, map);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    @Nullable
    public HashMap<SettingsGroupType, Settings> parseSettings(@Nullable byte[] cmd) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(cmd);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byte b2 = byteBufferWrap.get();
        if (b2 != 4) {
            Debug.fi(c, Intrinsics.stringPlus("type mismatch! ", Byte.valueOf(b2)));
            return null;
        }
        SettingsError settingsError = ByteBufferExtendsKt.getSettingsError(byteBufferWrap);
        if (settingsError != SettingsError.SUCCESS) {
            Debug.fi(c, Intrinsics.stringPlus("code error: ", settingsError));
            return null;
        }
        parse(byteBufferWrap, map);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    @Nullable
    public Object queryField(boolean z, @NotNull SettingsGroupType settingsGroupType, @NotNull ArrayList<Integer> arrayList, @NotNull Continuation<? super Settings> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQuerySettings = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuerySettings);
            Debug.fi(c, "queryField: " + settingsGroupType + ", fieldList:" + arrayList);
            BleProvider bleProvider = getBleProvider();
            byte[] bArrA = a(z, settingsGroupType, arrayList);
            aVar.a = settingsGroupType;
            aVar.d = 1;
            objQuerySettings = bleProvider.querySettings(bArrA, aVar);
            if (objQuerySettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            settingsGroupType = (SettingsGroupType) aVar.a;
            ResultKt.throwOnFailure(objQuerySettings);
        }
        HashMap map = (HashMap) objQuerySettings;
        if (map == null) {
            return null;
        }
        return (Settings) map.get(settingsGroupType);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00aa -> B:26:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    @org.jetbrains.annotations.Nullable
    public java.lang.Object querySettings(boolean r20, @org.jetbrains.annotations.NotNull com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType[] r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.HashMap<com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType, com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings>> r22) {
        /*
            r19 = this;
            r0 = r22
            boolean r1 = r0 instanceof com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2.b
            if (r1 == 0) goto L17
            r1 = r0
            com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2$b r1 = (com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2.b) r1
            int r2 = r1.i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.i = r2
            r2 = r19
            goto L1e
        L17:
            com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2$b r1 = new com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2$b
            r2 = r19
            r1.<init>(r0)
        L1e:
            java.lang.Object r0 = r1.g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.i
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L4d
            if (r4 != r6) goto L45
            int r4 = r1.f
            int r5 = r1.e
            boolean r7 = r1.d
            java.lang.Object r8 = r1.c
            com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType[] r8 = (com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType[]) r8
            java.lang.Object r9 = r1.b
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r10 = r1.a
            com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2 r10 = (com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2) r10
            kotlin.ResultKt.throwOnFailure(r0)
            r14 = r9
            r15 = r10
            goto Lb2
        L45:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4d:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r0 = java.util.Arrays.toString(r21)
            java.lang.String r4 = "querySettings: "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r0)
            java.lang.String r4 = "SettingsV2"
            com.xiaomi.hm.health.bt.debug.Debug.fi(r4, r0)
            r0 = r21
            int r7 = r0.length
            if (r7 != 0) goto L66
            r7 = 1
            goto L67
        L66:
            r7 = 0
        L67:
            if (r7 == 0) goto L72
            java.lang.String r0 = "V2版本全查效率低，请勿使用此方式！"
            com.xiaomi.hm.health.bt.debug.Debug.fi(r4, r0)
            com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType[] r0 = com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType.values()
        L72:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r7 = r0.length
            r15 = r2
            r14 = r4
            r4 = r0
            r0 = r20
        L7d:
            if (r5 >= r7) goto Lc4
            r10 = r4[r5]
            com.huami.bluetooth.profile.channel.module.settings.interfaces.BleProvider r13 = r15.getBleProvider()
            r11 = 0
            r12 = 4
            r16 = 0
            r8 = r15
            r9 = r0
            r17 = r13
            r13 = r16
            byte[] r8 = b(r8, r9, r10, r11, r12, r13)
            r1.a = r15
            r1.b = r14
            r1.c = r4
            r1.d = r0
            r1.e = r7
            r1.f = r5
            r1.i = r6
            r9 = r17
            java.lang.Object r8 = r9.querySettings(r8, r1)
            if (r8 != r3) goto Laa
            return r3
        Laa:
            r18 = r7
            r7 = r0
            r0 = r8
            r8 = r4
            r4 = r5
            r5 = r18
        Lb2:
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 != 0) goto Lb7
            goto Lba
        Lb7:
            r14.putAll(r0)
        Lba:
            int r0 = r4 + 1
            r4 = r8
            r18 = r5
            r5 = r0
            r0 = r7
            r7 = r18
            goto L7d
        Lc4:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2.querySettings(boolean, com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    public void setBleProvider(@NotNull BleProvider bleProvider) {
        this.bleProvider = bleProvider;
    }

    public final void setInterceptor(@NotNull SettingsInterceptor settingsInterceptor) {
        this.settingsInterceptor = settingsInterceptor;
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
    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    @org.jetbrains.annotations.Nullable
    public java.lang.Object writeSetting(@org.jetbrains.annotations.NotNull java.util.HashMap<com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType, com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2.writeSetting(java.util.HashMap, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
