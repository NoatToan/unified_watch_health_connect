package defpackage;

import com.huami.bluetooth.profile.channel.module.binary.BinaryDecoder;
import com.huami.bluetooth.profile.channel.module.contact.ContactModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lm5;", "Lg5t;", "Lmw;", PluginDeviceInfo.FMODEL, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/contact/ContactModule;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/contact/ContactModule;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class m5 implements g5t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f25756b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ContactModule f25757a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lm5$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactImpl", f = "ContactImpl.kt", i = {}, l = {29}, m = "queryVersion", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object t;
        public int v;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return m5.this.a(this);
        }
    }

    public m5(@NotNull ContactModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.f25757a = module;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object a(@NotNull Continuation<? super VersionInfo> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.v = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objSendRequest = bVar.t;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.v;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendRequest);
            ContactModule contactModule = this.f25757a;
            s2 s2Var = new s2(new r2(1, 0, 2, null), 2, null, 4, null);
            bVar.v = 1;
            objSendRequest = contactModule.sendRequest(s2Var, bVar);
            if (objSendRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendRequest);
        }
        u2 u2Var = (u2) objSendRequest;
        if (!u2Var.getF35299a()) {
            return new VersionInfo(0, 0, 0, 7, null);
        }
        VersionInfoDto versionInfoDto = new VersionInfoDto(null, null, null, 7, null);
        BinaryDecoder.decode(versionInfoDto, u2Var.getF35300b());
        return versionInfoDto.a();
    }
}
