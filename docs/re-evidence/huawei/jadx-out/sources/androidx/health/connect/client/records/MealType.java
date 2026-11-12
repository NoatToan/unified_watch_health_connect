package androidx.health.connect.client.records;

import defpackage.yyz;
import defpackage.zae;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/health/connect/client/records/MealType;", "", "<init>", "()V", "UNKNOWN", "", "BREAKFAST", "LUNCH", "DINNER", "SNACK", "MEAL_TYPE_UNKNOWN", "", "MEAL_TYPE_BREAKFAST", "MEAL_TYPE_LUNCH", "MEAL_TYPE_DINNER", "MEAL_TYPE_SNACK", "MEAL_TYPE_STRING_TO_INT_MAP", "", "MEAL_TYPE_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MealType {
    public static final String BREAKFAST = "breakfast";
    public static final String DINNER = "dinner";
    public static final MealType INSTANCE = new MealType();
    public static final String LUNCH = "lunch";
    public static final int MEAL_TYPE_BREAKFAST = 1;
    public static final int MEAL_TYPE_DINNER = 3;
    public static final Map<Integer, String> MEAL_TYPE_INT_TO_STRING_MAP;
    public static final int MEAL_TYPE_LUNCH = 2;
    public static final int MEAL_TYPE_SNACK = 4;
    public static final Map<String, Integer> MEAL_TYPE_STRING_TO_INT_MAP;
    public static final int MEAL_TYPE_UNKNOWN = 0;
    public static final String SNACK = "snack";
    public static final String UNKNOWN = "unknown";

    private MealType() {
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c("unknown", 0), yyz.c(BREAKFAST, 1), yyz.c(LUNCH, 2), yyz.c(DINNER, 3), yyz.c(SNACK, 4));
        MEAL_TYPE_STRING_TO_INT_MAP = mapE;
        MEAL_TYPE_INT_TO_STRING_MAP = UtilsKt.reverse(mapE);
    }
}
