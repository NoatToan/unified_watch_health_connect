package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

/* JADX INFO: loaded from: classes23.dex */
@SuppressAnimalSniffer
abstract class SpscArrayQueueProducerFields<E> extends SpscArrayQueueL1Pad<E> {
    public static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(SpscArrayQueueProducerFields.class, "producerIndex");
    public long producerIndex;
    public long producerLookAhead;

    public SpscArrayQueueProducerFields(int i) {
        super(i);
    }
}
