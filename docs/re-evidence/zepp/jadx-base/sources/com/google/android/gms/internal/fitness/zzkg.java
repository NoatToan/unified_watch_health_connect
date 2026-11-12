package com.google.android.gms.internal.fitness;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzacx' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public class zzkg {
    public static final zzkg zzacv;
    public static final zzkg zzacw;
    public static final zzkg zzacx;
    public static final zzkg zzacy;
    public static final zzkg zzacz;
    public static final zzkg zzada;
    public static final zzkg zzadb;
    public static final zzkg zzadc;
    public static final zzkg zzadd;
    public static final zzkg zzade;
    public static final zzkg zzadf;
    public static final zzkg zzadg;
    public static final zzkg zzadh;
    public static final zzkg zzadi;
    public static final zzkg zzadj;
    public static final zzkg zzadk;
    public static final zzkg zzadl;
    public static final zzkg zzadm;
    private static final /* synthetic */ zzkg[] zzadp;
    private final zzkj zzadn;
    private final int zzado;

    static {
        zzkg zzkgVar = new zzkg("DOUBLE", 0, zzkj.DOUBLE, 1);
        zzacv = zzkgVar;
        zzkg zzkgVar2 = new zzkg("FLOAT", 1, zzkj.FLOAT, 5);
        zzacw = zzkgVar2;
        zzkj zzkjVar = zzkj.LONG;
        final int i = 2;
        zzkg zzkgVar3 = new zzkg("INT64", 2, zzkjVar, 0);
        zzacx = zzkgVar3;
        final int i2 = 3;
        zzkg zzkgVar4 = new zzkg("UINT64", 3, zzkjVar, 0);
        zzacy = zzkgVar4;
        zzkj zzkjVar2 = zzkj.INT;
        zzkg zzkgVar5 = new zzkg("INT32", 4, zzkjVar2, 0);
        zzacz = zzkgVar5;
        zzkg zzkgVar6 = new zzkg("FIXED64", 5, zzkjVar, 1);
        zzada = zzkgVar6;
        zzkg zzkgVar7 = new zzkg("FIXED32", 6, zzkjVar2, 5);
        zzadb = zzkgVar7;
        zzkg zzkgVar8 = new zzkg("BOOL", 7, zzkj.BOOLEAN, 0);
        zzadc = zzkgVar8;
        final zzkj zzkjVar3 = zzkj.STRING;
        final String str = "STRING";
        final int i3 = 8;
        zzkg zzkgVar9 = new zzkg(str, i3, zzkjVar3, i) { // from class: com.google.android.gms.internal.fitness.z4
            {
                int i4 = 8;
                int i5 = 2;
                x4 x4Var = null;
            }
        };
        zzadd = zzkgVar9;
        final zzkj zzkjVar4 = zzkj.MESSAGE;
        final String str2 = "GROUP";
        final int i4 = 9;
        zzkg zzkgVar10 = new zzkg(str2, i4, zzkjVar4, i2) { // from class: com.google.android.gms.internal.fitness.b5
            {
                int i5 = 9;
                int i6 = 3;
                x4 x4Var = null;
            }
        };
        zzade = zzkgVar10;
        final String str3 = "MESSAGE";
        final int i5 = 10;
        final int i6 = 2;
        zzkg zzkgVar11 = new zzkg(str3, i5, zzkjVar4, i6) { // from class: com.google.android.gms.internal.fitness.a5
            {
                int i7 = 10;
                int i8 = 2;
                x4 x4Var = null;
            }
        };
        zzadf = zzkgVar11;
        final zzkj zzkjVar5 = zzkj.BYTE_STRING;
        final String str4 = "BYTES";
        final int i7 = 11;
        zzkg zzkgVar12 = new zzkg(str4, i7, zzkjVar5, i6) { // from class: com.google.android.gms.internal.fitness.c5
            {
                int i8 = 11;
                int i9 = 2;
                x4 x4Var = null;
            }
        };
        zzadg = zzkgVar12;
        zzkg zzkgVar13 = new zzkg("UINT32", 12, zzkjVar2, 0);
        zzadh = zzkgVar13;
        zzkg zzkgVar14 = new zzkg("ENUM", 13, zzkj.ENUM, 0);
        zzadi = zzkgVar14;
        zzkg zzkgVar15 = new zzkg("SFIXED32", 14, zzkjVar2, 5);
        zzadj = zzkgVar15;
        zzkg zzkgVar16 = new zzkg("SFIXED64", 15, zzkjVar, 1);
        zzadk = zzkgVar16;
        zzkg zzkgVar17 = new zzkg("SINT32", 16, zzkjVar2, 0);
        zzadl = zzkgVar17;
        zzkg zzkgVar18 = new zzkg("SINT64", 17, zzkjVar, 0);
        zzadm = zzkgVar18;
        zzadp = new zzkg[]{zzkgVar, zzkgVar2, zzkgVar3, zzkgVar4, zzkgVar5, zzkgVar6, zzkgVar7, zzkgVar8, zzkgVar9, zzkgVar10, zzkgVar11, zzkgVar12, zzkgVar13, zzkgVar14, zzkgVar15, zzkgVar16, zzkgVar17, zzkgVar18};
    }

    private zzkg(String str, int i, zzkj zzkjVar, int i2) {
        super(str, i);
        this.zzadn = zzkjVar;
        this.zzado = i2;
    }

    public static zzkg[] values() {
        return (zzkg[]) zzadp.clone();
    }

    public final zzkj zzdx() {
        return this.zzadn;
    }

    public final int zzdy() {
        return this.zzado;
    }

    public /* synthetic */ zzkg(String str, int i, zzkj zzkjVar, int i2, x4 x4Var) {
        this(str, i, zzkjVar, i2);
    }
}
