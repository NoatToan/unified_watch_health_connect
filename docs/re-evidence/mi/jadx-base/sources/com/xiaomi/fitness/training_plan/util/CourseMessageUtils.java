package com.xiaomi.fitness.training_plan.util;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.k1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/CourseMessageUtils;", "", "<init>", "()V", "getCourseIntroduce", "", "courseCode", "getCourseAttention", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseMessageUtils {

    @NotNull
    public static final CourseMessageUtils INSTANCE = new CourseMessageUtils();

    private CourseMessageUtils() {
    }

    @NotNull
    public final String getCourseAttention() {
        return ResourceExtKt.getString(k1j.t);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final String getCourseIntroduce(@NotNull String courseCode) {
        Intrinsics.checkNotNullParameter(courseCode, "courseCode");
        int iHashCode = courseCode.hashCode();
        if (iHashCode != 2126) {
            switch (iHashCode) {
                case 2064:
                    if (courseCode.equals("A1")) {
                        return ResourceExtKt.getString(k1j.q);
                    }
                    break;
                case 2065:
                    if (courseCode.equals("A2")) {
                        return ResourceExtKt.getString(k1j.f23328r);
                    }
                    break;
                case 2066:
                    if (courseCode.equals("A3")) {
                        return ResourceExtKt.getString(k1j.s);
                    }
                    break;
                default:
                    switch (iHashCode) {
                        case 2095:
                            if (courseCode.equals("B1")) {
                                return ResourceExtKt.getString(k1j.u);
                            }
                            break;
                        case 2096:
                            if (courseCode.equals("B2")) {
                                return ResourceExtKt.getString(k1j.v);
                            }
                            break;
                        case 2097:
                            if (courseCode.equals("B3")) {
                                return ResourceExtKt.getString(k1j.w);
                            }
                            break;
                        case 2098:
                            if (courseCode.equals("B4")) {
                                return ResourceExtKt.getString(k1j.x);
                            }
                            break;
                        case 2099:
                            if (courseCode.equals("B5")) {
                                return ResourceExtKt.getString(k1j.y);
                            }
                            break;
                        default:
                            switch (iHashCode) {
                                case 2157:
                                    if (courseCode.equals("D1")) {
                                        return ResourceExtKt.getString(k1j.A);
                                    }
                                    break;
                                case 2158:
                                    if (courseCode.equals("D2")) {
                                        return ResourceExtKt.getString(k1j.B);
                                    }
                                    break;
                                case 2159:
                                    if (courseCode.equals("D3")) {
                                        return ResourceExtKt.getString(k1j.C);
                                    }
                                    break;
                                default:
                                    switch (iHashCode) {
                                        case 2188:
                                            if (courseCode.equals("E1")) {
                                                return ResourceExtKt.getString(k1j.D);
                                            }
                                            break;
                                        case 2189:
                                            if (courseCode.equals("E2")) {
                                                return ResourceExtKt.getString(k1j.E);
                                            }
                                            break;
                                        case 2190:
                                            if (courseCode.equals("E3")) {
                                                return ResourceExtKt.getString(k1j.F);
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else if (courseCode.equals("C1")) {
            return ResourceExtKt.getString(k1j.z);
        }
        return "";
    }
}
