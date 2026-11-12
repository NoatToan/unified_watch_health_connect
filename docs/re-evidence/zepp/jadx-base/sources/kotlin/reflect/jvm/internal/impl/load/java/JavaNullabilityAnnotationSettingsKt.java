package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class JavaNullabilityAnnotationSettingsKt {

    @NotNull
    private static final FqName a;

    @NotNull
    private static final FqName b;

    @NotNull
    private static final NullabilityAnnotationStates<JavaNullabilityAnnotationsStatus> c;

    @NotNull
    private static final JavaNullabilityAnnotationsStatus d;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        a = fqName;
        FqName fqName2 = new FqName("org.checkerframework.checker.nullness.compatqual");
        b = fqName2;
        FqName fqName3 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        FqName fqName4 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        KotlinVersion kotlinVersion = new KotlinVersion(1, 6);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        c = new NullabilityAnnotationStatesImpl(r.mapOf(TuplesKt.to(fqName3, companion.getDEFAULT()), TuplesKt.to(new FqName("androidx.annotation"), companion.getDEFAULT()), TuplesKt.to(new FqName("android.support.annotation"), companion.getDEFAULT()), TuplesKt.to(new FqName("android.annotation"), companion.getDEFAULT()), TuplesKt.to(new FqName("com.android.annotations"), companion.getDEFAULT()), TuplesKt.to(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT()), TuplesKt.to(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT()), TuplesKt.to(fqName2, companion.getDEFAULT()), TuplesKt.to(new FqName("javax.annotation"), companion.getDEFAULT()), TuplesKt.to(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT()), TuplesKt.to(new FqName("io.reactivex.annotations"), companion.getDEFAULT()), TuplesKt.to(fqName4, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null)), TuplesKt.to(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null)), TuplesKt.to(new FqName("lombok"), companion.getDEFAULT()), TuplesKt.to(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kotlinVersion, reportLevel2)), TuplesKt.to(new FqName("io.reactivex.rxjava3.annotations"), new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 7), reportLevel2))));
        d = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    @NotNull
    public static final Jsr305Settings getDefaultJsr305Settings(@NotNull KotlinVersion kotlinVersion) {
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = d;
        ReportLevel reportLevelBefore = (javaNullabilityAnnotationsStatus.getSinceVersion() == null || javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(kotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.getReportLevelBefore() : javaNullabilityAnnotationsStatus.getReportLevelAfter();
        return new Jsr305Settings(reportLevelBefore, getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevelBefore), null, 4, null);
    }

    public static /* synthetic */ Jsr305Settings getDefaultJsr305Settings$default(KotlinVersion kotlinVersion, int i, Object obj) {
        if ((i & 1) != 0) {
            kotlinVersion = KotlinVersion.CURRENT;
        }
        return getDefaultJsr305Settings(kotlinVersion);
    }

    @Nullable
    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(@NotNull ReportLevel reportLevel) {
        if (reportLevel == ReportLevel.WARN) {
            return null;
        }
        return reportLevel;
    }

    @NotNull
    public static final ReportLevel getDefaultReportLevelForAnnotation(@NotNull FqName fqName) {
        return getReportLevelForAnnotation$default(fqName, NullabilityAnnotationStates.Companion.getEMPTY(), null, 4, null);
    }

    @NotNull
    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return a;
    }

    @NotNull
    public static final ReportLevel getReportLevelForAnnotation(@NotNull FqName fqName, @NotNull NullabilityAnnotationStates<? extends ReportLevel> nullabilityAnnotationStates, @NotNull KotlinVersion kotlinVersion) {
        ReportLevel reportLevel = nullabilityAnnotationStates.get(fqName);
        if (reportLevel != null) {
            return reportLevel;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = c.get(fqName);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        return (javaNullabilityAnnotationsStatus.getSinceVersion() == null || javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(kotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.getReportLevelBefore() : javaNullabilityAnnotationsStatus.getReportLevelAfter();
    }

    public static /* synthetic */ ReportLevel getReportLevelForAnnotation$default(FqName fqName, NullabilityAnnotationStates nullabilityAnnotationStates, KotlinVersion kotlinVersion, int i, Object obj) {
        if ((i & 4) != 0) {
            kotlinVersion = KotlinVersion.CURRENT;
        }
        return getReportLevelForAnnotation(fqName, nullabilityAnnotationStates, kotlinVersion);
    }
}
