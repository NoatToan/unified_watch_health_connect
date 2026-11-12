package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

/* JADX INFO: renamed from: zdy, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u00022/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\r\"\u0012\u0010\u0010\u001a\u00060\u000fj\u0002`\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0012\u001a\u00060\u000fj\u0002`\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0013\u001a\u00060\u000fj\u0002`\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0014\u001a\u00060\u000fj\u0002`\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0015\u001a\u00060\u000fj\u0002`\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0016\u001a\u00060\u000fj\u0002`\u0011X\u0082T¢\u0006\u0002\n\u0000*\f\b\u0002\u0010\u000e\"\u00020\u000f2\u00020\u000f¨\u0006\u0017"}, d2 = {VastAttribute.SEQUENCE, "Lkotlin/sequences/Sequence;", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function2;", "Lkotlin/sequences/SequenceScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "iterator", "", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "State", "", "State_NotReady", "Lkotlin/sequences/State;", "State_ManyNotReady", "State_ManyReady", "State_Ready", "State_Done", "State_Failed", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class C0463zdy {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: zdy$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> implements Sequence<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f54016b;

        public a(Function2 function2) {
            this.f54016b = function2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return zdz.d(this.f54016b);
        }
    }

    public static final <T> Sequence<T> e(Function2<? super SequenceScope<? super T>, ? super Continuation<? super yzc>, ? extends Object> function2) {
        zcp.c(function2, "");
        return new a(function2);
    }

    public static final <T> Iterator<T> d(Function2<? super SequenceScope<? super T>, ? super Continuation<? super yzc>, ? extends Object> function2) {
        zcp.c(function2, "");
        zdt zdtVar = new zdt();
        zdtVar.b(zbg.a(function2, zdtVar, zdtVar));
        return zdtVar;
    }
}
