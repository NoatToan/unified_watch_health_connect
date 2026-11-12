package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: renamed from: zjq, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0007\u001aT\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000726\u0010\t\u001a2\u0012\u0013\u0012\u0011H\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u0011H\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\u0001\u001a6\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u000f0\u0005\u001au\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u0002H\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052:\u0010\t\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0002\b\u0011\"$\u0010\u0000\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"defaultAreEquivalent", "Lkotlin/Function2;", "", "", "defaultKeySelector", "Lkotlin/Function1;", "distinctUntilChanged", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "areEquivalent", "Lkotlin/ParameterName;", "name", "old", "new", "distinctUntilChangedBy", "K", "keySelector", "distinctUntilChangedBy$FlowKt__DistinctKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class defaultAreEquivalent {
    private static final Function1<Object, Object> d = b.f54198b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2<Object, Object, Boolean> f54197b = d.d;

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> b(Flow<? extends T> flow) {
        return flow instanceof StateFlow ? flow : c(flow, d, f54197b);
    }

    /* JADX INFO: renamed from: zjq$d */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "old", "", "new", TrackConstants$Opers.INVOKE, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Object, Object, Boolean> {
        public static final d d = new d();

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(zcp.b(obj, obj2));
        }

        d() {
            super(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Flow<T> c(Flow<? extends T> flow, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (flow instanceof zjl) {
            zjl zjlVar = (zjl) flow;
            if (zjlVar.e == function1 && zjlVar.f54188b == function2) {
                return flow;
            }
        }
        return new zjl(flow, function1, function2);
    }

    /* JADX INFO: renamed from: zjq$b */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends Lambda implements Function1<Object, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f54198b = new b();

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }

        b() {
            super(1);
        }
    }
}
