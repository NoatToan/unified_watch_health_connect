package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class a {
    public static final int A = 1211250227;
    public static final int A0 = 1701733238;
    public static final int B = 1681012275;
    public static final int B0 = 1701733217;
    public static final int C = 1835295092;
    public static final int C0 = 1718775137;
    public static final int D = 1836069985;
    public static final int D0 = 1935763834;
    public static final int E = 778924082;
    public static final int E0 = 1935763823;
    public static final int F = 778924083;
    public static final int F0 = 1935828848;
    public static final int G = 1835557169;
    public static final int G0 = 1936158820;
    public static final int H = 1835560241;
    public static final int H0 = 1970628964;
    public static final int I = 1835557187;
    public static final int I0 = 1936027235;
    public static final int J = 2002876005;
    public static final int J0 = 1885434736;
    public static final int K = 1819304813;
    public static final int K0 = 1414810956;
    public static final int L = 1936684916;
    public static final int L0 = 1831958048;
    public static final int M = 1633889587;
    public static final int M0 = 1836070006;
    public static final int N = 1684103987;
    public static final int N0 = 1937011827;
    public static final int O = 1700998451;
    public static final int O0 = 1937011571;
    public static final int P = 1684366131;
    public static final int P0 = 1668576371;
    public static final int Q = 1633889588;
    public static final int Q0 = 1937011555;
    public static final int R = 1684103988;
    public static final int R0 = 1937011578;
    public static final int S = 1685353315;
    public static final int S0 = 1937013298;
    public static final int T = 1685353320;
    public static final int T0 = 1937007471;
    public static final int U = 1685353324;
    public static final int U0 = 1668232756;
    public static final int V = 1685353317;
    public static final int V0 = 1954034535;
    public static final int W = 1685353336;
    public static final int W0 = 2004251764;
    public static final int X = 1684305011;
    public static final int X0 = 1937010800;
    public static final int Y = 1952867444;
    public static final int Y0 = 1664495672;
    public static final int Z = 1952868452;
    public static final int Z0 = 1935764850;
    public static final int a0 = 1953654136;
    public static final int a1 = 1935767394;
    public static final int b = 8;
    public static final int b0 = 1953658222;
    public static final int b1 = 1969517665;
    public static final int c = 12;
    public static final int c0 = 1936286840;
    public static final int c1 = 1835365473;
    public static final int d = 16;
    public static final int d0 = 1836019574;
    public static final int d1 = 1936553057;
    public static final int e = 1;
    public static final int e0 = 1836086884;
    public static final int e1 = 1935766900;
    public static final int f = 0;
    public static final int f0 = 1836476516;
    public static final int f1 = 1801812339;
    public static final int g = 1718909296;
    public static final int g0 = 1953653099;
    public static final int g1 = 1768715124;
    public static final int h = 1635148593;
    public static final int h0 = 1835297121;
    public static final int h1 = 1835360622;
    public static final int i = 1635148595;
    public static final int i0 = 1835626086;
    public static final int i1 = 1851878757;
    public static final int j = 1635148611;
    public static final int j0 = 1937007212;
    public static final int j1 = 1684108385;
    public static final int k = 1752589105;
    public static final int k0 = 1702061171;
    public static final int k1 = 1701671783;
    public static final int l = 1751479857;
    public static final int l0 = 1836019558;
    public static final int l1 = 1936995172;
    public static final int m = 1752589123;
    public static final int m0 = 1953653094;
    public static final int m1 = 1937126244;
    public static final int n = 1987063864;
    public static final int n0 = 1836475768;
    public static final int n1 = 1886547818;
    public static final int o = 1987063865;
    public static final int o0 = 1835362404;
    public static final int o1 = 1667329389;
    public static final int p = 1987076931;
    public static final int p0 = 1953196132;
    public static final int p1 = 1835365492;
    public static final int q = 1635135537;
    public static final int q0 = 1701082227;
    public static final int q1 = 1634492771;
    public static final int r = 1635135811;
    public static final int r0 = 1701606260;
    public static final int r1 = 1634492791;
    public static final int s = 1668246642;
    public static final int s0 = 1835296868;
    public static final int s1 = 1970037111;
    public static final int t = 1685479798;
    public static final int t0 = 1751411826;
    public static final int t1 = 1332770163;
    public static final int u = 1685479729;
    public static final int u0 = 1937011556;
    public static final int u1 = 1682927731;
    public static final int v = 1685481573;
    public static final int v0 = 1886614376;
    public static final int v1 = 1716281667;
    public static final int w = 1685481521;
    public static final int w0 = 1936289382;
    public static final int w1 = 1684425825;
    public static final int x = 1685480259;
    public static final int x0 = 1935894637;
    public static final int x1 = 1953984371;
    public static final int y = 1685485123;
    public static final int y0 = 1935894633;
    public static final int z = 1932670515;
    public static final int z0 = 1952804451;
    public final int a;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.a$a, reason: collision with other inner class name */
    public static final class C0147a extends a {
        public final List<C0147a> A1;
        public final long y1;
        public final List<b> z1;

        public C0147a(int type, long endPosition) {
            super(type);
            this.y1 = endPosition;
            this.z1 = new ArrayList();
            this.A1 = new ArrayList();
        }

        public void d(C0147a atom) {
            this.A1.add(atom);
        }

        public void e(b atom) {
            this.z1.add(atom);
        }

        public int f(int type) {
            int size = this.z1.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (this.z1.get(i2).a == type) {
                    i++;
                }
            }
            int size2 = this.A1.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (this.A1.get(i3).a == type) {
                    i++;
                }
            }
            return i;
        }

        @Nullable
        public C0147a g(int type) {
            int size = this.A1.size();
            for (int i = 0; i < size; i++) {
                C0147a c0147a = this.A1.get(i);
                if (c0147a.a == type) {
                    return c0147a;
                }
            }
            return null;
        }

        @Nullable
        public b h(int type) {
            int size = this.z1.size();
            for (int i = 0; i < size; i++) {
                b bVar = this.z1.get(i);
                if (bVar.a == type) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.a
        public String toString() {
            String strA = a.a(this.a);
            String string = Arrays.toString(this.z1.toArray());
            String string2 = Arrays.toString(this.A1.toArray());
            StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 22 + String.valueOf(string).length() + String.valueOf(string2).length());
            sb.append(strA);
            sb.append(" leaves: ");
            sb.append(string);
            sb.append(" containers: ");
            sb.append(string2);
            return sb.toString();
        }
    }

    public static final class b extends a {
        public final ParsableByteArray y1;

        public b(int type, ParsableByteArray data) {
            super(type);
            this.y1 = data;
        }
    }

    public a(int type) {
        this.a = type;
    }

    public static String a(int type) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((type >> 24) & 255));
        sb.append((char) ((type >> 16) & 255));
        sb.append((char) ((type >> 8) & 255));
        sb.append((char) (type & 255));
        return sb.toString();
    }

    public static int b(int fullAtomInt) {
        return fullAtomInt & 16777215;
    }

    public static int c(int fullAtomInt) {
        return (fullAtomInt >> 24) & 255;
    }

    public String toString() {
        return a(this.a);
    }
}
