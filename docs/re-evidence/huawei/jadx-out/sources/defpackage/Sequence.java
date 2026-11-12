package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: zdw, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\t\"\u0002H\u0002¢\u0006\u0002\u0010\n\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000b\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a!\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a2\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a)\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00120\u0001H\u0007¢\u0006\u0002\b\u0013\u001aC\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00050\u0015H\u0002¢\u0006\u0002\b\u0016\u001a@\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00190\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0014*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00140\u00180\u0001\u001a\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a&\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0007\u001ab\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u001e\"\u0004\b\u0002\u0010\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001e0!2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00050\u0015H\u0000\u001a\u001c\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a=\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020%2\b\u0010'\u001a\u0004\u0018\u0001H\u00022\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0015H\u0007¢\u0006\u0002\u0010(\u001a<\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020%2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006*"}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", ExifInterface.GPS_DIRECTION_TRUE, "iterator", "Lkotlin/Function0;", "", "asSequence", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "emptySequence", "orEmpty", "ifEmpty", "defaultValue", "flatten", "", "flattenSequenceOfIterable", "R", "Lkotlin/Function1;", "flatten$SequencesKt__SequencesKt", "unzip", "Lkotlin/Pair;", "", "shuffled", "random", "Lkotlin/random/Random;", "flatMapIndexed", TypeParams.SEARCH_CODE, "source", "transform", "Lkotlin/Function2;", "", "constrainOnce", "generateSequence", "", "nextFunction", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "seedFunction", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class Sequence extends asSequence {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a(Object obj) {
        return obj;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: zdw$c */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements kotlin.sequences.Sequence<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f54014a;

        public c(Iterator it) {
            this.f54014a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f54014a;
        }
    }

    public static final <T> kotlin.sequences.Sequence<T> a(Iterator<? extends T> it) {
        zcp.c(it, "");
        return zdz.d((kotlin.sequences.Sequence) new c(it));
    }

    public static final <T> kotlin.sequences.Sequence<T> d() {
        return zdu.f54009c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlin.sequences.Sequence<T> d(kotlin.sequences.Sequence<? extends T> sequence) {
        zcp.c(sequence, "");
        return sequence instanceof zdn ? sequence : new zdn(sequence);
    }

    public static final <T> kotlin.sequences.Sequence<T> b(final T t, Function1<? super T, ? extends T> function1) {
        zcp.c(function1, "");
        if (t == null) {
            return zdu.f54009c;
        }
        return new zds(new Function0() { // from class: zdx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Sequence.a(t);
            }
        }, function1);
    }
}
