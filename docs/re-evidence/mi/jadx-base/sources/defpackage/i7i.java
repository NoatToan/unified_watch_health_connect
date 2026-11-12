package defpackage;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i7i extends GeneratedMessageLite<i7i, a> implements csf {
    private static final i7i DEFAULT_INSTANCE;
    private static volatile ykh<i7i> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.emptyMapField();

    public static final class a extends GeneratedMessageLite.a<i7i, a> implements csf {
        public /* synthetic */ a(h7i h7iVar) {
            this();
        }

        public a u(String str, PreferencesProto$Value preferencesProto$Value) {
            str.getClass();
            preferencesProto$Value.getClass();
            l();
            ((i7i) this.f2174b).E().put(str, preferencesProto$Value);
            return this;
        }

        public a() {
            super(i7i.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y<String, PreferencesProto$Value> f20860a = y.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, PreferencesProto$Value.L());
    }

    static {
        i7i i7iVar = new i7i();
        DEFAULT_INSTANCE = i7iVar;
        GeneratedMessageLite.A(i7i.class, i7iVar);
    }

    public static a I() {
        return DEFAULT_INSTANCE.k();
    }

    public static i7i J(InputStream inputStream) throws IOException {
        return (i7i) GeneratedMessageLite.y(DEFAULT_INSTANCE, inputStream);
    }

    public final Map<String, PreferencesProto$Value> E() {
        return G();
    }

    public Map<String, PreferencesProto$Value> F() {
        return Collections.unmodifiableMap(H());
    }

    public final MapFieldLite<String, PreferencesProto$Value> G() {
        if (!this.preferences_.isMutable()) {
            this.preferences_ = this.preferences_.mutableCopy();
        }
        return this.preferences_;
    }

    public final MapFieldLite<String, PreferencesProto$Value> H() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object o(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        h7i h7iVar = null;
        switch (h7i.f19778a[methodToInvoke.ordinal()]) {
            case 1:
                return new i7i();
            case 2:
                return new a(h7iVar);
            case 3:
                return GeneratedMessageLite.x(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f20860a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                ykh<i7i> bVar = PARSER;
                if (bVar == null) {
                    synchronized (i7i.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
