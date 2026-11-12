package kotlinx.serialization.internal;

import com.facebook.share.model.ShareStoryContent;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b,\u0010-J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\u00028\u0001H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0007\u001a\u00028\u0002H$¢\u0006\u0004\b\u0007\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\b*\u00028\u0002H$¢\u0006\u0004\b\u0011\u0010\fJ\u0013\u0010\u0012\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0016*\u00028\u00022\u0006\u0010\u0015\u001a\u00020\bH$¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00028\u0001H&¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J1\u0010'\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00022\b\b\u0002\u0010&\u001a\u00020%H$¢\u0006\u0004\b'\u0010(J/\u0010*\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010)\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH$¢\u0006\u0004\b*\u0010+\u0082\u0001\u0002./¨\u00060"}, d2 = {"Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Element", "Collection", ShareStoryContent.Builder.k, "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "builder", "", "a", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;)I", "collectionSize", "(Ljava/lang/Object;)I", "", "collectionIterator", "(Ljava/lang/Object;)Ljava/util/Iterator;", "()Ljava/lang/Object;", "builderSize", "toResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "toBuilder", "size", "", "checkCapacity", "(Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "previous", "merge", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "index", "", "checkIndex", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", "startIndex", "readAll", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "<init>", "()V", "Lkotlinx/serialization/internal/ListLikeSerializer;", "Lkotlinx/serialization/internal/MapLikeSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 5, 1})
@InternalSerializationApi
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements KSerializer<Collection> {
    private AbstractCollectionSerializer() {
    }

    public /* synthetic */ AbstractCollectionSerializer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int a(CompositeDecoder decoder, Builder builder) {
        int iDecodeCollectionSize = decoder.decodeCollectionSize(getDescriptor());
        checkCapacity(builder, iDecodeCollectionSize);
        return iDecodeCollectionSize;
    }

    public static /* synthetic */ void readElement$default(AbstractCollectionSerializer abstractCollectionSerializer, CompositeDecoder compositeDecoder, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        abstractCollectionSerializer.readElement(compositeDecoder, i, obj, z);
    }

    public abstract Builder builder();

    public abstract int builderSize(Builder builder);

    public abstract void checkCapacity(Builder builder, int i);

    @NotNull
    public abstract Iterator<Element> collectionIterator(Collection collection);

    public abstract int collectionSize(Collection collection);

    @Override // kotlinx.serialization.DeserializationStrategy
    public Collection deserialize(@NotNull Decoder decoder) {
        return merge(decoder, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InternalSerializationApi
    public final Collection merge(@NotNull Decoder decoder, @Nullable Collection previous) {
        Object builder = previous == null ? null : toBuilder(previous);
        if (builder == null) {
            builder = builder();
        }
        int iBuilderSize = builderSize(builder);
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(getDescriptor());
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            readAll(compositeDecoderBeginStructure, builder, iBuilderSize, a(compositeDecoderBeginStructure, builder));
        } else {
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                readElement$default(this, compositeDecoderBeginStructure, iBuilderSize + iDecodeElementIndex, builder, false, 8, null);
            }
        }
        compositeDecoderBeginStructure.endStructure(getDescriptor());
        return (Collection) toResult(builder);
    }

    public abstract void readAll(@NotNull CompositeDecoder decoder, Builder builder, int startIndex, int size);

    public abstract void readElement(@NotNull CompositeDecoder decoder, int index, Builder builder, boolean checkIndex);

    @Override // kotlinx.serialization.SerializationStrategy
    public abstract void serialize(@NotNull Encoder encoder, Collection value);

    public abstract Builder toBuilder(Collection collection);

    public abstract Collection toResult(Builder builder);
}
