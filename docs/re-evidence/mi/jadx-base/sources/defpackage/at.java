package defpackage;

import android.text.TextUtils;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0007\u0010\u0010J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015H\u0016¢\u0006\u0004\b\u0007\u0010\u0018J!\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0007\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0019J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0019J\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\u0019R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lat;", "Lbi;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "Lf4s;", "header", "", PluginDeviceInfo.FMODEL, "(Lf4s;)V", PluginDeviceInfo.FICONON, "()Lf4s;", "", "data", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", PluginDeviceInfo.FICONOFF, "()Ljava/util/List;", "()[B", "Ljava/util/Calendar;", StepsInfo.KEY_CALORIES, PluginDeviceInfo.FDESC, "(Ljava/util/Calendar;)Ljava/util/List;", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onProgress", "(Lkotlin/jvm/functions/Function1;)V", "([B)Ljava/util/List;", Constants.KEY_RECHARGE_VALUES, "Lct;", PluginDeviceInfo.FICONOFFLINE, "Ldt;", "Lht;", "Ljava/io/ByteArrayOutputStream;", "mDataStream$delegate", "Lkotlin/Lazy;", "()Ljava/io/ByteArrayOutputStream;", "mDataStream", "", "type", "", "supportVersion", "<init>", "(BZ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class at implements bi<List<? extends Spo2Data>> {

    @NotNull
    public static final a z = new a(null);
    public final byte t;
    public final boolean u;
    public int v;

    @Nullable
    public f4s w;

    @NotNull
    public final Lazy x = LazyKt__LazyJVMKt.lazy(b.t);

    @Nullable
    public Function1<? super Progress, Unit> y;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lat$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/ByteArrayOutputStream;", PluginDeviceInfo.FMODEL, "()Ljava/io/ByteArrayOutputStream;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<ByteArrayOutputStream> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteArrayOutputStream invoke() {
            return new ByteArrayOutputStream();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Spo2Data> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Spo2Data> list) {
            super(0);
            this.u = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("type:");
            sb.append((int) at.this.t);
            sb.append(", data:");
            Iterable arrayList = this.u;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            sb.append(TextUtils.join(",", arrayList));
            return sb.toString();
        }
    }

    public at(byte b2, boolean z2) {
        this.t = b2;
        this.u = z2;
    }

    @Override // defpackage.bi
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<Spo2Data> a(@NotNull Calendar cal) {
        Intrinsics.checkNotNullParameter(cal, "cal");
        return null;
    }

    @Override // defpackage.bi
    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public f4s getW() {
        return this.w;
    }

    @Override // defpackage.bi
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<Spo2Data> b() {
        byte[] it = e().toByteArray();
        if (this.u) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (!(it.length == 0)) {
                this.v = it[0] & 255;
                it = ArraysKt___ArraysJvmKt.copyOfRange(it, 1, it.length);
            }
        }
        List<Spo2Data> listA = a(it);
        return listA == null ? CollectionsKt__CollectionsKt.emptyList() : listA;
    }

    public final ByteArrayOutputStream e() {
        return (ByteArrayOutputStream) this.x.getValue();
    }

    public final List<ht> c(byte[] values) {
        if (!this.u) {
            return ht.c.a(values);
        }
        int i = this.v;
        if (i == 1) {
            return ht.c.a(values);
        }
        if (i == 2) {
            return it.f.a(values);
        }
        t5t.d("Spo2DataParser", "type: " + ((int) this.t) + ", version: " + this.v + " not support!");
        return null;
    }

    public final List<ct> e(byte[] values) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < values.length; i += 12) {
            arrayList.add(new ct(tet.v(values, i, 4), tet.v(values, i + 4, 4), tet.v(values, i + 8, 4)));
        }
        return arrayList;
    }

    @Override // defpackage.bi
    public void a(@NotNull mb mbVar) {
        bi.a.a(this, mbVar);
    }

    public final List<dt> b(byte[] values) {
        if (!this.u) {
            return dt.c.a(values);
        }
        int i = this.v;
        if (i == 1) {
            return dt.c.a(values);
        }
        if (i != 2) {
            t5t.d("Spo2DataParser", "type: " + ((int) this.t) + ", version: " + this.v + " not support!");
            return null;
        }
        return et.i.a(values);
    }

    @Override // defpackage.bi
    public void a(@Nullable f4s header) {
        this.w = header;
        e().reset();
    }

    @Override // defpackage.bi
    @Nullable
    public Object a(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) throws IOException {
        e().write(bArr);
        Function1<? super Progress, Unit> function1 = this.y;
        if (function1 != null) {
            f4s f4sVar = this.w;
            function1.invoke2(new Progress(f4sVar != null ? f4sVar.f17407b : 100, e().size()));
        }
        return Unit.INSTANCE;
    }

    public final List<Spo2Data> d(byte[] values) {
        if (!this.u) {
            return ft.e.a(values);
        }
        int i = this.v;
        if (i == 1) {
            return gt.f19308b.a(values);
        }
        if (i != 2) {
            t5t.d("Spo2DataParser", "type: " + ((int) this.t) + ", version: " + this.v + " not support!");
            return null;
        }
        return ft.e.a(values);
    }

    @Override // defpackage.bi
    @NotNull
    public byte[] a() {
        byte[] byteArray = e().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "mDataStream.toByteArray()");
        return byteArray;
    }

    @Override // defpackage.bi
    public void a(@NotNull Function1<? super Progress, Unit> onProgress) {
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.y = onProgress;
    }

    public final List<Spo2Data> a(byte[] data) {
        List<Spo2Data> listE;
        if (data == null) {
            return null;
        }
        try {
            byte b2 = this.t;
            if (b2 == 37) {
                listE = c(data);
            } else if (b2 == 38) {
                listE = b(data);
            } else if (b2 == 39) {
                listE = d(data);
            } else if (b2 == 43) {
                listE = gt.f19308b.a(data);
            } else {
                listE = b2 == 40 ? e(data) : null;
            }
            le.c("Spo2DataParser", new c(listE));
            return listE;
        } catch (Exception e) {
            t5t.d("Spo2DataParser", "parseSpo2Data exception:" + e.getMessage());
            return null;
        }
    }
}
