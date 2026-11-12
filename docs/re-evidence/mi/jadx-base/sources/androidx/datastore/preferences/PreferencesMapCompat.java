package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import defpackage.i7i;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/datastore/preferences/PreferencesMapCompat;", "", "()V", "Companion", "datastore-preferences-proto"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PreferencesMapCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/datastore/preferences/PreferencesMapCompat$Companion;", "", "Ljava/io/InputStream;", "input", "Li7i;", "readFrom", "(Ljava/io/InputStream;)Li7i;", "<init>", "()V", "datastore-preferences-proto"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final i7i readFrom(@NotNull InputStream input) throws IOException {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                i7i i7iVarJ = i7i.J(input);
                Intrinsics.checkNotNullExpressionValue(i7iVarJ, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return i7iVarJ;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }
    }
}
