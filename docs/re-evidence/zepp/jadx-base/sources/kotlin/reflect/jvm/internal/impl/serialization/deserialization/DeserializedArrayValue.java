package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class DeserializedArrayValue extends ArrayValue {

    @NotNull
    private final KotlinType c;

    public static final class a extends Lambda implements Function1<ModuleDescriptor, KotlinType> {
        public final /* synthetic */ KotlinType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KotlinType kotlinType) {
            super(1);
            this.a = kotlinType;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KotlinType invoke(@NotNull ModuleDescriptor moduleDescriptor) {
            return this.a;
        }
    }

    public DeserializedArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull KotlinType kotlinType) {
        super(list, new a(kotlinType));
        this.c = kotlinType;
    }

    @NotNull
    public final KotlinType getType() {
        return this.c;
    }
}
