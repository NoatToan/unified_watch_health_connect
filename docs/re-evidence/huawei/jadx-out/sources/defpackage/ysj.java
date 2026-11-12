package defpackage;

import com.iabtcf.utils.FieldDefs;
import java.util.EnumMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes20.dex */
public class ysj {
    private final ysh e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumMap<FieldDefs, Integer> f53807c = new EnumMap<>(FieldDefs.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumMap<FieldDefs, Integer> f53806b = new EnumMap<>(FieldDefs.class);

    public ysj(ysh yshVar) {
        this.e = yshVar;
    }

    public Integer e(FieldDefs fieldDefs, Function<ysh, Integer> function) {
        return d(fieldDefs, this.f53807c, function);
    }

    public Integer c(FieldDefs fieldDefs, Function<ysh, Integer> function) {
        return d(fieldDefs, this.f53806b, function);
    }

    private Integer d(FieldDefs fieldDefs, EnumMap<FieldDefs, Integer> enumMap, Function<ysh, Integer> function) {
        if (!fieldDefs.isDynamic()) {
            return function.apply(this.e);
        }
        Integer num = enumMap.get(fieldDefs);
        if (num != null) {
            return num;
        }
        Integer numApply = function.apply(this.e);
        enumMap.put(fieldDefs, numApply);
        return numApply;
    }
}
