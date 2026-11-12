package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.a;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.i7i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0013H\u0002J\u0019\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/datastore/preferences/core/PreferencesSerializer;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/preferences/core/Preferences;", "()V", "defaultValue", "getDefaultValue", "()Landroidx/datastore/preferences/core/Preferences;", "fileExtension", "", "getFileExtension", "()Ljava/lang/String;", "addProtoEntryToPreferences", "", "name", "value", "Landroidx/datastore/preferences/PreferencesProto$Value;", "mutablePreferences", "Landroidx/datastore/preferences/core/MutablePreferences;", "getValueProto", "", "readFrom", "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", DeviceTagInterface.CUSTOM_TAG_TYPE, "output", "Ljava/io/OutputStream;", "(Landroidx/datastore/preferences/core/Preferences;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PreferencesSerializer implements Serializer<Preferences> {

    @NotNull
    public static final PreferencesSerializer INSTANCE = new PreferencesSerializer();

    @NotNull
    private static final String fileExtension = "preferences_pb";

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            iArr[PreferencesProto$Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto$Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto$Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto$Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto$Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto$Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto$Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto$Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PreferencesSerializer() {
    }

    private final void addProtoEntryToPreferences(String name, PreferencesProto$Value value, MutablePreferences mutablePreferences) throws CorruptionException {
        PreferencesProto$Value.ValueCase valueCaseS = value.S();
        switch (valueCaseS == null ? -1 : WhenMappings.$EnumSwitchMapping$0[valueCaseS.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.set(PreferencesKeys.booleanKey(name), Boolean.valueOf(value.K()));
                return;
            case 2:
                mutablePreferences.set(PreferencesKeys.floatKey(name), Float.valueOf(value.N()));
                return;
            case 3:
                mutablePreferences.set(PreferencesKeys.doubleKey(name), Double.valueOf(value.M()));
                return;
            case 4:
                mutablePreferences.set(PreferencesKeys.intKey(name), Integer.valueOf(value.O()));
                return;
            case 5:
                mutablePreferences.set(PreferencesKeys.longKey(name), Long.valueOf(value.P()));
                return;
            case 6:
                Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(name);
                String strQ = value.Q();
                Intrinsics.checkNotNullExpressionValue(strQ, "value.string");
                mutablePreferences.set(keyStringKey, strQ);
                return;
            case 7:
                Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(name);
                List<String> listH = value.R().H();
                Intrinsics.checkNotNullExpressionValue(listH, "value.stringSet.stringsList");
                mutablePreferences.set(keyStringSetKey, CollectionsKt___CollectionsKt.toSet(listH));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final PreferencesProto$Value getValueProto(Object value) {
        if (value instanceof Boolean) {
            PreferencesProto$Value preferencesProto$ValueBuild = PreferencesProto$Value.T().u(((Boolean) value).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild, "newBuilder().setBoolean(value).build()");
            return preferencesProto$ValueBuild;
        }
        if (value instanceof Float) {
            PreferencesProto$Value preferencesProto$ValueBuild2 = PreferencesProto$Value.T().w(((Number) value).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild2, "newBuilder().setFloat(value).build()");
            return preferencesProto$ValueBuild2;
        }
        if (value instanceof Double) {
            PreferencesProto$Value preferencesProto$ValueBuild3 = PreferencesProto$Value.T().v(((Number) value).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild3, "newBuilder().setDouble(value).build()");
            return preferencesProto$ValueBuild3;
        }
        if (value instanceof Integer) {
            PreferencesProto$Value preferencesProto$ValueBuild4 = PreferencesProto$Value.T().x(((Number) value).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild4, "newBuilder().setInteger(value).build()");
            return preferencesProto$ValueBuild4;
        }
        if (value instanceof Long) {
            PreferencesProto$Value preferencesProto$ValueBuild5 = PreferencesProto$Value.T().y(((Number) value).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild5, "newBuilder().setLong(value).build()");
            return preferencesProto$ValueBuild5;
        }
        if (value instanceof String) {
            PreferencesProto$Value preferencesProto$ValueBuild6 = PreferencesProto$Value.T().z((String) value).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild6, "newBuilder().setString(value).build()");
            return preferencesProto$ValueBuild6;
        }
        if (!(value instanceof Set)) {
            throw new IllegalStateException(Intrinsics.stringPlus("PreferencesSerializer does not support type: ", value.getClass().getName()));
        }
        PreferencesProto$Value preferencesProto$ValueBuild7 = PreferencesProto$Value.T().A(a.I().u((Set) value)).build();
        Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return preferencesProto$ValueBuild7;
    }

    @NotNull
    public final String getFileExtension() {
        return fileExtension;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation<? super Preferences> continuation) throws IOException {
        i7i from = PreferencesMapCompat.INSTANCE.readFrom(inputStream);
        MutablePreferences mutablePreferencesCreateMutable = PreferencesFactory.createMutable(new Preferences.Pair[0]);
        Map<String, PreferencesProto$Value> mapF = from.F();
        Intrinsics.checkNotNullExpressionValue(mapF, "preferencesProto.preferencesMap");
        for (Map.Entry<String, PreferencesProto$Value> entry : mapF.entrySet()) {
            String name = entry.getKey();
            PreferencesProto$Value value = entry.getValue();
            PreferencesSerializer preferencesSerializer = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            preferencesSerializer.addProtoEntryToPreferences(name, value, mutablePreferencesCreateMutable);
        }
        return mutablePreferencesCreateMutable.toPreferences();
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(Preferences preferences, OutputStream outputStream, Continuation continuation) {
        return writeTo2(preferences, outputStream, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    @NotNull
    public Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
    }

    @Nullable
    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(@NotNull Preferences preferences, @NotNull OutputStream outputStream, @NotNull Continuation<? super Unit> continuation) throws IOException {
        Map<Preferences.Key<?>, Object> mapAsMap = preferences.asMap();
        i7i.a aVarI = i7i.I();
        for (Map.Entry<Preferences.Key<?>, Object> entry : mapAsMap.entrySet()) {
            aVarI.u(entry.getKey().getName(), getValueProto(entry.getValue()));
        }
        aVarI.build().h(outputStream);
        return Unit.INSTANCE;
    }
}
