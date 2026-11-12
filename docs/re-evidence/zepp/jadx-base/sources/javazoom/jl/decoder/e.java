package javazoom.jl.decoder;

import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.huami.mifit.sportlib.common.DataTypeSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
final class e {
    private static final double j = 3.141592653589793d;
    private float[] a;
    private float[] b;
    private float[] c;
    private int d;
    private float[] e;
    private int f;
    private float g;
    private float[] h;
    private float[] i = new float[32];
    private static final float k = (float) (1.0d / (Math.cos(0.04908738521234052d) * 2.0d));
    private static final float l = (float) (1.0d / (Math.cos(0.14726215563702155d) * 2.0d));
    private static final float m = (float) (1.0d / (Math.cos(0.2454369260617026d) * 2.0d));
    private static final float n = (float) (1.0d / (Math.cos(0.3436116964863836d) * 2.0d));
    private static final float o = (float) (1.0d / (Math.cos(0.44178646691106466d) * 2.0d));
    private static final float p = (float) (1.0d / (Math.cos(0.5399612373357456d) * 2.0d));
    private static final float q = (float) (1.0d / (Math.cos(0.6381360077604268d) * 2.0d));
    private static final float r = (float) (1.0d / (Math.cos(0.7363107781851077d) * 2.0d));
    private static final float s = (float) (1.0d / (Math.cos(0.8344855486097889d) * 2.0d));
    private static final float t = (float) (1.0d / (Math.cos(0.9326603190344698d) * 2.0d));
    private static final float u = (float) (1.0d / (Math.cos(1.030835089459151d) * 2.0d));
    private static final float v = (float) (1.0d / (Math.cos(1.1290098598838318d) * 2.0d));
    private static final float w = (float) (1.0d / (Math.cos(1.227184630308513d) * 2.0d));
    private static final float x = (float) (1.0d / (Math.cos(1.325359400733194d) * 2.0d));
    private static final float y = (float) (1.0d / (Math.cos(1.423534171157875d) * 2.0d));
    private static final float z = (float) (1.0d / (Math.cos(1.521708941582556d) * 2.0d));
    private static final float A = (float) (1.0d / (Math.cos(0.09817477042468103d) * 2.0d));
    private static final float B = (float) (1.0d / (Math.cos(0.2945243112740431d) * 2.0d));
    private static final float C = (float) (1.0d / (Math.cos(0.4908738521234052d) * 2.0d));
    private static final float D = (float) (1.0d / (Math.cos(0.6872233929727672d) * 2.0d));
    private static final float E = (float) (1.0d / (Math.cos(0.8835729338221293d) * 2.0d));
    private static final float F = (float) (1.0d / (Math.cos(1.0799224746714913d) * 2.0d));
    private static final float G = (float) (1.0d / (Math.cos(1.2762720155208536d) * 2.0d));
    private static final float H = (float) (1.0d / (Math.cos(1.4726215563702154d) * 2.0d));
    private static final float I = (float) (1.0d / (Math.cos(0.19634954084936207d) * 2.0d));
    private static final float J = (float) (1.0d / (Math.cos(0.5890486225480862d) * 2.0d));
    private static final float K = (float) (1.0d / (Math.cos(0.9817477042468103d) * 2.0d));
    private static final float L = (float) (1.0d / (Math.cos(1.3744467859455345d) * 2.0d));
    private static final float M = (float) (1.0d / (Math.cos(0.39269908169872414d) * 2.0d));
    private static final float N = (float) (1.0d / (Math.cos(1.1780972450961724d) * 2.0d));
    private static final float O = (float) (1.0d / (Math.cos(0.7853981633974483d) * 2.0d));
    private static float[] P = null;
    private static float[][] Q = null;

    public e(int i, float f, float[] fArr) {
        if (P == null) {
            float[] fArrW = w();
            P = fArrW;
            Q = z(fArrW, 16);
        }
        this.a = new float[512];
        this.b = new float[512];
        this.e = new float[32];
        this.f = i;
        this.g = f;
        y(this.h);
        x();
    }

    private static float[] A(float[] fArr, int i, int i2) {
        if (i + i2 > fArr.length) {
            i2 = fArr.length - i;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        float[] fArr2 = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr2[i3] = fArr[i + i3];
        }
        return fArr2;
    }

    private void b() {
        float[] fArr = this.e;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = fArr[16];
        float f18 = fArr[17];
        float f19 = fArr[18];
        float f20 = fArr[19];
        float f21 = fArr[20];
        float f22 = fArr[21];
        float f23 = fArr[22];
        float f24 = fArr[23];
        float f25 = fArr[24];
        float f26 = fArr[25];
        float f27 = fArr[26];
        float f28 = fArr[27];
        float f29 = fArr[28];
        float f30 = fArr[29];
        float f31 = fArr[30];
        float f32 = fArr[31];
        float f33 = f + f32;
        float f34 = f2 + f31;
        float f35 = f3 + f30;
        float f36 = f4 + f29;
        float f37 = f5 + f28;
        float f38 = f6 + f27;
        float f39 = f7 + f26;
        float f40 = f8 + f25;
        float f41 = f9 + f24;
        float f42 = f10 + f23;
        float f43 = f11 + f22;
        float f44 = f12 + f21;
        float f45 = f13 + f20;
        float f46 = f14 + f19;
        float f47 = f15 + f18;
        float f48 = f16 + f17;
        float f49 = f33 + f48;
        float f50 = f34 + f47;
        float f51 = f35 + f46;
        float f52 = f36 + f45;
        float f53 = f37 + f44;
        float f54 = f38 + f43;
        float f55 = f39 + f42;
        float f56 = f40 + f41;
        float f57 = f33 - f48;
        float f58 = A;
        float f59 = f57 * f58;
        float f60 = f34 - f47;
        float f61 = B;
        float f62 = f60 * f61;
        float f63 = f35 - f46;
        float f64 = C;
        float f65 = f63 * f64;
        float f66 = f36 - f45;
        float f67 = D;
        float f68 = f66 * f67;
        float f69 = f37 - f44;
        float f70 = E;
        float f71 = f69 * f70;
        float f72 = f38 - f43;
        float f73 = F;
        float f74 = f72 * f73;
        float f75 = f39 - f42;
        float f76 = G;
        float f77 = f75 * f76;
        float f78 = f40 - f41;
        float f79 = H;
        float f80 = f78 * f79;
        float f81 = f49 + f56;
        float f82 = f50 + f55;
        float f83 = f51 + f54;
        float f84 = f52 + f53;
        float f85 = f49 - f56;
        float f86 = I;
        float f87 = f85 * f86;
        float f88 = f50 - f55;
        float f89 = J;
        float f90 = f88 * f89;
        float f91 = f51 - f54;
        float f92 = K;
        float f93 = f91 * f92;
        float f94 = f52 - f53;
        float f95 = L;
        float f96 = f94 * f95;
        float f97 = f59 + f80;
        float f98 = f62 + f77;
        float f99 = f65 + f74;
        float f100 = f68 + f71;
        float f101 = (f59 - f80) * f86;
        float f102 = (f62 - f77) * f89;
        float f103 = (f65 - f74) * f92;
        float f104 = (f68 - f71) * f95;
        float f105 = f81 + f84;
        float f106 = f82 + f83;
        float f107 = M;
        float f108 = (f81 - f84) * f107;
        float f109 = N;
        float f110 = (f82 - f83) * f109;
        float f111 = f87 + f96;
        float f112 = f90 + f93;
        float f113 = (f87 - f96) * f107;
        float f114 = (f90 - f93) * f109;
        float f115 = f97 + f100;
        float f116 = f98 + f99;
        float f117 = (f97 - f100) * f107;
        float f118 = (f98 - f99) * f109;
        float f119 = f101 + f104;
        float f120 = f102 + f103;
        float f121 = (f101 - f104) * f107;
        float f122 = (f102 - f103) * f109;
        float f123 = f105 + f106;
        float f124 = O;
        float f125 = (f105 - f106) * f124;
        float f126 = f108 + f110;
        float f127 = (f108 - f110) * f124;
        float f128 = f111 + f112;
        float f129 = (f111 - f112) * f124;
        float f130 = f113 + f114;
        float f131 = (f113 - f114) * f124;
        float f132 = f115 + f116;
        float f133 = (f115 - f116) * f124;
        float f134 = f117 + f118;
        float f135 = (f117 - f118) * f124;
        float f136 = f119 + f120;
        float f137 = (f119 - f120) * f124;
        float f138 = f121 + f122;
        float f139 = (f121 - f122) * f124;
        float f140 = f131 + f129;
        float f141 = -f140;
        float f142 = f141 - f130;
        float f143 = ((-f130) - f131) - f128;
        float f144 = f139 + f135;
        float f145 = f144 + f137;
        float f146 = f139 + f137 + f133;
        float f147 = -f146;
        float f148 = f147 - f138;
        float f149 = (-f138) - f139;
        float f150 = (f149 - f134) - f135;
        float f151 = f150 - f137;
        float f152 = (f149 - f136) - f132;
        float f153 = f150 - f136;
        float f154 = -f123;
        float f155 = -f127;
        float f156 = f155 - f126;
        float f157 = (f - f32) * k;
        float f158 = (f2 - f31) * l;
        float f159 = (f3 - f30) * m;
        float f160 = (f4 - f29) * n;
        float f161 = (f5 - f28) * o;
        float f162 = (f6 - f27) * p;
        float f163 = (f7 - f26) * q;
        float f164 = (f8 - f25) * r;
        float f165 = (f9 - f24) * s;
        float f166 = (f10 - f23) * t;
        float f167 = (f11 - f22) * u;
        float f168 = (f12 - f21) * v;
        float f169 = (f13 - f20) * w;
        float f170 = (f14 - f19) * x;
        float f171 = (f15 - f18) * y;
        float f172 = (f16 - f17) * z;
        float f173 = f157 + f172;
        float f174 = f158 + f171;
        float f175 = f159 + f170;
        float f176 = f160 + f169;
        float f177 = f161 + f168;
        float f178 = f162 + f167;
        float f179 = f163 + f166;
        float f180 = f164 + f165;
        float f181 = (f157 - f172) * f58;
        float f182 = (f158 - f171) * f61;
        float f183 = (f159 - f170) * f64;
        float f184 = (f160 - f169) * f67;
        float f185 = (f161 - f168) * f70;
        float f186 = (f162 - f167) * f73;
        float f187 = (f163 - f166) * f76;
        float f188 = (f164 - f165) * f79;
        float f189 = f173 + f180;
        float f190 = f174 + f179;
        float f191 = f175 + f178;
        float f192 = f176 + f177;
        float f193 = (f173 - f180) * f86;
        float f194 = (f174 - f179) * f89;
        float f195 = (f175 - f178) * f92;
        float f196 = (f176 - f177) * f95;
        float f197 = f181 + f188;
        float f198 = f182 + f187;
        float f199 = f183 + f186;
        float f200 = f184 + f185;
        float f201 = (f181 - f188) * f86;
        float f202 = (f182 - f187) * f89;
        float f203 = (f183 - f186) * f92;
        float f204 = (f184 - f185) * f95;
        float f205 = f189 + f192;
        float f206 = f190 + f191;
        float f207 = (f189 - f192) * f107;
        float f208 = (f190 - f191) * f109;
        float f209 = f193 + f196;
        float f210 = f194 + f195;
        float f211 = (f193 - f196) * f107;
        float f212 = (f194 - f195) * f109;
        float f213 = f197 + f200;
        float f214 = f198 + f199;
        float f215 = (f197 - f200) * f107;
        float f216 = (f198 - f199) * f109;
        float f217 = f201 + f204;
        float f218 = f202 + f203;
        float f219 = (f201 - f204) * f107;
        float f220 = (f202 - f203) * f109;
        float f221 = f205 + f206;
        float f222 = (f205 - f206) * f124;
        float f223 = f207 + f208;
        float f224 = (f207 - f208) * f124;
        float f225 = f209 + f210;
        float f226 = (f209 - f210) * f124;
        float f227 = f211 + f212;
        float f228 = (f211 - f212) * f124;
        float f229 = f213 + f214;
        float f230 = (f213 - f214) * f124;
        float f231 = f215 + f216;
        float f232 = (f215 - f216) * f124;
        float f233 = f217 + f218;
        float f234 = (f217 - f218) * f124;
        float f235 = f219 + f220;
        float f236 = (f219 - f220) * f124;
        float f237 = f236 + f228;
        float f238 = f237 + f232;
        float f239 = f238 + f226 + f234;
        float f240 = f236 + f232 + f224;
        float f241 = f240 + f234;
        float f242 = f234 + f236 + f230;
        float f243 = f242 + f222;
        float f244 = -f243;
        float f245 = f244 - f235;
        float f246 = f242 + f226 + f228;
        float f247 = -f246;
        float f248 = (f247 - f227) - f235;
        float f249 = (((-f231) - f232) - f235) - f236;
        float f250 = f249 - f234;
        float f251 = (f250 - f223) - f224;
        float f252 = ((f250 - f226) - f227) - f228;
        float f253 = f249 - f233;
        float f254 = (f253 - f223) - f224;
        float f255 = f225 + f227 + f228;
        float f256 = f253 - f255;
        float f257 = (((-f229) - f233) - f235) - f236;
        float f258 = f257 - f221;
        float f259 = f257 - f255;
        float[] fArr2 = this.c;
        int i = this.d;
        int i2 = i + 0;
        fArr2[i2] = f125;
        int i3 = i + 16;
        fArr2[i3] = f243;
        int i4 = i + 32;
        fArr2[i4] = f146;
        int i5 = i + 48;
        fArr2[i5] = f246;
        int i6 = i + 64;
        fArr2[i6] = f140;
        int i7 = i + 80;
        fArr2[i7] = f239;
        int i8 = i + 96;
        fArr2[i8] = f145;
        int i9 = i + 112;
        fArr2[i9] = f241;
        int i10 = i + 128;
        fArr2[i10] = f127;
        int i11 = i + 144;
        fArr2[i11] = f240;
        int i12 = i + 160;
        fArr2[i12] = f144;
        int i13 = i + DataTypeSource.SPORT_TYPE_BRIDGE;
        fArr2[i13] = f238;
        int i14 = i + 192;
        fArr2[i14] = f131;
        int i15 = i + 208;
        fArr2[i15] = f237;
        int i16 = i + 224;
        fArr2[i16] = f139;
        int i17 = i + 240;
        fArr2[i17] = f236;
        int i18 = i + 256;
        fArr2[i18] = 0.0f;
        int i19 = i + 272;
        fArr2[i19] = -f236;
        int i20 = i + 288;
        fArr2[i20] = -f139;
        int i21 = i + 304;
        fArr2[i21] = -f237;
        int i22 = i + GlMapUtil.DEVICE_DISPLAY_DPI_HIGH;
        fArr2[i22] = -f131;
        int i23 = i + 336;
        fArr2[i23] = -f238;
        int i24 = i + 352;
        fArr2[i24] = -f144;
        int i25 = i + 368;
        fArr2[i25] = -f240;
        int i26 = i + 384;
        fArr2[i26] = f155;
        int i27 = i + 400;
        fArr2[i27] = -f241;
        int i28 = i + 416;
        fArr2[i28] = -f145;
        int i29 = i + 432;
        fArr2[i29] = -f239;
        int i30 = i + 448;
        fArr2[i30] = f141;
        int i31 = i + 464;
        fArr2[i31] = f247;
        int i32 = i + 480;
        fArr2[i32] = f147;
        int i33 = i + 496;
        fArr2[i33] = f244;
        float[] fArr3 = this.a;
        if (fArr2 == fArr3) {
            fArr3 = this.b;
        }
        fArr3[i2] = -f125;
        fArr3[i3] = f245;
        fArr3[i4] = f148;
        fArr3[i5] = f248;
        fArr3[i6] = f142;
        fArr3[i7] = f252;
        fArr3[i8] = f151;
        fArr3[i9] = f251;
        fArr3[i10] = f156;
        fArr3[i11] = f254;
        fArr3[i12] = f153;
        fArr3[i13] = f256;
        fArr3[i14] = f143;
        fArr3[i15] = f259;
        fArr3[i16] = f152;
        fArr3[i17] = f258;
        fArr3[i18] = f154;
        fArr3[i19] = f258;
        fArr3[i20] = f152;
        fArr3[i21] = f259;
        fArr3[i22] = f143;
        fArr3[i23] = f256;
        fArr3[i24] = f153;
        fArr3[i25] = f254;
        fArr3[i26] = f156;
        fArr3[i27] = f251;
        fArr3[i28] = f151;
        fArr3[i29] = f252;
        fArr3[i30] = f142;
        fArr3[i31] = f248;
        fArr3[i32] = f148;
        fArr3[i33] = f245;
    }

    private void c() {
        float[] fArr = new float[32];
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        for (int i = 31; i >= 0; i--) {
            fArr[i] = 0.0f;
        }
        float[] fArr4 = this.e;
        fArr2[0] = fArr4[0] + fArr4[31];
        fArr2[1] = fArr4[1] + fArr4[30];
        fArr2[2] = fArr4[2] + fArr4[29];
        fArr2[3] = fArr4[3] + fArr4[28];
        fArr2[4] = fArr4[4] + fArr4[27];
        fArr2[5] = fArr4[5] + fArr4[26];
        fArr2[6] = fArr4[6] + fArr4[25];
        fArr2[7] = fArr4[7] + fArr4[24];
        fArr2[8] = fArr4[8] + fArr4[23];
        fArr2[9] = fArr4[9] + fArr4[22];
        fArr2[10] = fArr4[10] + fArr4[21];
        fArr2[11] = fArr4[11] + fArr4[20];
        fArr2[12] = fArr4[12] + fArr4[19];
        fArr2[13] = fArr4[13] + fArr4[18];
        fArr2[14] = fArr4[14] + fArr4[17];
        fArr2[15] = fArr4[15] + fArr4[16];
        fArr3[0] = fArr2[0] + fArr2[15];
        fArr3[1] = fArr2[1] + fArr2[14];
        fArr3[2] = fArr2[2] + fArr2[13];
        fArr3[3] = fArr2[3] + fArr2[12];
        fArr3[4] = fArr2[4] + fArr2[11];
        fArr3[5] = fArr2[5] + fArr2[10];
        fArr3[6] = fArr2[6] + fArr2[9];
        fArr3[7] = fArr2[7] + fArr2[8];
        float f = fArr2[0] - fArr2[15];
        float f2 = A;
        fArr3[8] = f * f2;
        float f3 = fArr2[1] - fArr2[14];
        float f4 = B;
        fArr3[9] = f3 * f4;
        float f5 = fArr2[2] - fArr2[13];
        float f6 = C;
        fArr3[10] = f5 * f6;
        float f7 = fArr2[3] - fArr2[12];
        float f8 = D;
        fArr3[11] = f7 * f8;
        float f9 = fArr2[4] - fArr2[11];
        float f10 = E;
        fArr3[12] = f9 * f10;
        float f11 = fArr2[5] - fArr2[10];
        float f12 = F;
        fArr3[13] = f11 * f12;
        float f13 = fArr2[6] - fArr2[9];
        float f14 = G;
        fArr3[14] = f13 * f14;
        float f15 = fArr2[7] - fArr2[8];
        float f16 = H;
        fArr3[15] = f15 * f16;
        fArr2[0] = fArr3[0] + fArr3[7];
        fArr2[1] = fArr3[1] + fArr3[6];
        fArr2[2] = fArr3[2] + fArr3[5];
        fArr2[3] = fArr3[3] + fArr3[4];
        float f17 = fArr3[0] - fArr3[7];
        float f18 = I;
        fArr2[4] = f17 * f18;
        float f19 = fArr3[1] - fArr3[6];
        float f20 = J;
        fArr2[5] = f19 * f20;
        float f21 = fArr3[2] - fArr3[5];
        float f22 = K;
        fArr2[6] = f21 * f22;
        float f23 = fArr3[3] - fArr3[4];
        float f24 = L;
        fArr2[7] = f23 * f24;
        fArr2[8] = fArr3[8] + fArr3[15];
        fArr2[9] = fArr3[9] + fArr3[14];
        fArr2[10] = fArr3[10] + fArr3[13];
        fArr2[11] = fArr3[11] + fArr3[12];
        fArr2[12] = (fArr3[8] - fArr3[15]) * f18;
        fArr2[13] = (fArr3[9] - fArr3[14]) * f20;
        fArr2[14] = (fArr3[10] - fArr3[13]) * f22;
        fArr2[15] = (fArr3[11] - fArr3[12]) * f24;
        fArr3[0] = fArr2[0] + fArr2[3];
        fArr3[1] = fArr2[1] + fArr2[2];
        float f25 = fArr2[0] - fArr2[3];
        float f26 = M;
        fArr3[2] = f25 * f26;
        float f27 = fArr2[1] - fArr2[2];
        float f28 = N;
        fArr3[3] = f27 * f28;
        fArr3[4] = fArr2[4] + fArr2[7];
        fArr3[5] = fArr2[5] + fArr2[6];
        fArr3[6] = (fArr2[4] - fArr2[7]) * f26;
        fArr3[7] = (fArr2[5] - fArr2[6]) * f28;
        fArr3[8] = fArr2[8] + fArr2[11];
        fArr3[9] = fArr2[9] + fArr2[10];
        fArr3[10] = (fArr2[8] - fArr2[11]) * f26;
        fArr3[11] = (fArr2[9] - fArr2[10]) * f28;
        fArr3[12] = fArr2[12] + fArr2[15];
        fArr3[13] = fArr2[13] + fArr2[14];
        fArr3[14] = (fArr2[12] - fArr2[15]) * f26;
        fArr3[15] = (fArr2[13] - fArr2[14]) * f28;
        fArr2[0] = fArr3[0] + fArr3[1];
        float f29 = fArr3[0] - fArr3[1];
        float f30 = O;
        fArr2[1] = f29 * f30;
        fArr2[2] = fArr3[2] + fArr3[3];
        fArr2[3] = (fArr3[2] - fArr3[3]) * f30;
        fArr2[4] = fArr3[4] + fArr3[5];
        fArr2[5] = (fArr3[4] - fArr3[5]) * f30;
        fArr2[6] = fArr3[6] + fArr3[7];
        fArr2[7] = (fArr3[6] - fArr3[7]) * f30;
        fArr2[8] = fArr3[8] + fArr3[9];
        fArr2[9] = (fArr3[8] - fArr3[9]) * f30;
        fArr2[10] = fArr3[10] + fArr3[11];
        fArr2[11] = (fArr3[10] - fArr3[11]) * f30;
        fArr2[12] = fArr3[12] + fArr3[13];
        fArr2[13] = (fArr3[12] - fArr3[13]) * f30;
        fArr2[14] = fArr3[14] + fArr3[15];
        fArr2[15] = (fArr3[14] - fArr3[15]) * f30;
        float f31 = fArr2[7];
        fArr[12] = f31;
        float f32 = f31 + fArr2[5];
        fArr[4] = f32;
        fArr[19] = (-f32) - fArr2[6];
        fArr[27] = ((-fArr2[6]) - fArr2[7]) - fArr2[4];
        float f33 = fArr2[15];
        fArr[14] = f33;
        float f34 = f33 + fArr2[11];
        fArr[10] = f34;
        fArr[6] = f34 + fArr2[13];
        float f35 = fArr2[15] + fArr2[13] + fArr2[9];
        fArr[2] = f35;
        fArr[17] = (-f35) - fArr2[14];
        float f36 = (((-fArr2[14]) - fArr2[15]) - fArr2[10]) - fArr2[11];
        fArr[21] = f36 - fArr2[13];
        fArr[29] = (((-fArr2[14]) - fArr2[15]) - fArr2[12]) - fArr2[8];
        fArr[25] = f36 - fArr2[12];
        fArr[31] = -fArr2[0];
        fArr[0] = fArr2[1];
        float f37 = fArr2[3];
        fArr[8] = f37;
        fArr[23] = (-f37) - fArr2[2];
        fArr2[0] = (fArr4[0] - fArr4[31]) * k;
        fArr2[1] = (fArr4[1] - fArr4[30]) * l;
        fArr2[2] = (fArr4[2] - fArr4[29]) * m;
        fArr2[3] = (fArr4[3] - fArr4[28]) * n;
        fArr2[4] = (fArr4[4] - fArr4[27]) * o;
        fArr2[5] = (fArr4[5] - fArr4[26]) * p;
        fArr2[6] = (fArr4[6] - fArr4[25]) * q;
        fArr2[7] = (fArr4[7] - fArr4[24]) * r;
        fArr2[8] = (fArr4[8] - fArr4[23]) * s;
        fArr2[9] = (fArr4[9] - fArr4[22]) * t;
        fArr2[10] = (fArr4[10] - fArr4[21]) * u;
        fArr2[11] = (fArr4[11] - fArr4[20]) * v;
        fArr2[12] = (fArr4[12] - fArr4[19]) * w;
        fArr2[13] = (fArr4[13] - fArr4[18]) * x;
        fArr2[14] = (fArr4[14] - fArr4[17]) * y;
        fArr2[15] = (fArr4[15] - fArr4[16]) * z;
        fArr3[0] = fArr2[0] + fArr2[15];
        fArr3[1] = fArr2[1] + fArr2[14];
        fArr3[2] = fArr2[2] + fArr2[13];
        fArr3[3] = fArr2[3] + fArr2[12];
        fArr3[4] = fArr2[4] + fArr2[11];
        fArr3[5] = fArr2[5] + fArr2[10];
        fArr3[6] = fArr2[6] + fArr2[9];
        fArr3[7] = fArr2[7] + fArr2[8];
        fArr3[8] = (fArr2[0] - fArr2[15]) * f2;
        fArr3[9] = (fArr2[1] - fArr2[14]) * f4;
        fArr3[10] = (fArr2[2] - fArr2[13]) * f6;
        fArr3[11] = (fArr2[3] - fArr2[12]) * f8;
        fArr3[12] = (fArr2[4] - fArr2[11]) * f10;
        fArr3[13] = (fArr2[5] - fArr2[10]) * f12;
        fArr3[14] = (fArr2[6] - fArr2[9]) * f14;
        fArr3[15] = (fArr2[7] - fArr2[8]) * f16;
        fArr2[0] = fArr3[0] + fArr3[7];
        fArr2[1] = fArr3[1] + fArr3[6];
        fArr2[2] = fArr3[2] + fArr3[5];
        fArr2[3] = fArr3[3] + fArr3[4];
        fArr2[4] = (fArr3[0] - fArr3[7]) * f18;
        fArr2[5] = (fArr3[1] - fArr3[6]) * f20;
        fArr2[6] = (fArr3[2] - fArr3[5]) * f22;
        fArr2[7] = (fArr3[3] - fArr3[4]) * f24;
        fArr2[8] = fArr3[8] + fArr3[15];
        fArr2[9] = fArr3[9] + fArr3[14];
        fArr2[10] = fArr3[10] + fArr3[13];
        fArr2[11] = fArr3[11] + fArr3[12];
        fArr2[12] = (fArr3[8] - fArr3[15]) * f18;
        fArr2[13] = (fArr3[9] - fArr3[14]) * f20;
        fArr2[14] = (fArr3[10] - fArr3[13]) * f22;
        fArr2[15] = (fArr3[11] - fArr3[12]) * f24;
        fArr3[0] = fArr2[0] + fArr2[3];
        fArr3[1] = fArr2[1] + fArr2[2];
        fArr3[2] = (fArr2[0] - fArr2[3]) * f26;
        fArr3[3] = (fArr2[1] - fArr2[2]) * f28;
        fArr3[4] = fArr2[4] + fArr2[7];
        fArr3[5] = fArr2[5] + fArr2[6];
        fArr3[6] = (fArr2[4] - fArr2[7]) * f26;
        fArr3[7] = (fArr2[5] - fArr2[6]) * f28;
        fArr3[8] = fArr2[8] + fArr2[11];
        fArr3[9] = fArr2[9] + fArr2[10];
        fArr3[10] = (fArr2[8] - fArr2[11]) * f26;
        fArr3[11] = (fArr2[9] - fArr2[10]) * f28;
        fArr3[12] = fArr2[12] + fArr2[15];
        fArr3[13] = fArr2[13] + fArr2[14];
        fArr3[14] = (fArr2[12] - fArr2[15]) * f26;
        fArr3[15] = (fArr2[13] - fArr2[14]) * f28;
        fArr2[0] = fArr3[0] + fArr3[1];
        fArr2[1] = (fArr3[0] - fArr3[1]) * f30;
        fArr2[2] = fArr3[2] + fArr3[3];
        fArr2[3] = (fArr3[2] - fArr3[3]) * f30;
        fArr2[4] = fArr3[4] + fArr3[5];
        fArr2[5] = (fArr3[4] - fArr3[5]) * f30;
        fArr2[6] = fArr3[6] + fArr3[7];
        fArr2[7] = (fArr3[6] - fArr3[7]) * f30;
        fArr2[8] = fArr3[8] + fArr3[9];
        fArr2[9] = (fArr3[8] - fArr3[9]) * f30;
        fArr2[10] = fArr3[10] + fArr3[11];
        fArr2[11] = (fArr3[10] - fArr3[11]) * f30;
        fArr2[12] = fArr3[12] + fArr3[13];
        fArr2[13] = (fArr3[12] - fArr3[13]) * f30;
        fArr2[14] = fArr3[14] + fArr3[15];
        fArr2[15] = (fArr3[14] - fArr3[15]) * f30;
        float f38 = fArr2[15];
        fArr[15] = f38;
        float f39 = f38 + fArr2[7];
        fArr[13] = f39;
        float f40 = f39 + fArr2[11];
        fArr[11] = f40;
        fArr[5] = f40 + fArr2[5] + fArr2[13];
        float f41 = fArr2[15] + fArr2[11] + fArr2[3];
        fArr[9] = f41;
        fArr[7] = f41 + fArr2[13];
        float f42 = fArr2[13] + fArr2[15] + fArr2[9];
        float f43 = fArr2[1] + f42;
        fArr[1] = f43;
        fArr[16] = (-f43) - fArr2[14];
        float f44 = f42 + fArr2[5] + fArr2[7];
        fArr[3] = f44;
        fArr[18] = ((-f44) - fArr2[6]) - fArr2[14];
        float f45 = (((-fArr2[10]) - fArr2[11]) - fArr2[14]) - fArr2[15];
        fArr[22] = ((f45 - fArr2[13]) - fArr2[2]) - fArr2[3];
        fArr[20] = (((f45 - fArr2[13]) - fArr2[5]) - fArr2[6]) - fArr2[7];
        fArr[24] = ((f45 - fArr2[12]) - fArr2[2]) - fArr2[3];
        float f46 = f45 - fArr2[12];
        float f47 = fArr2[4] + fArr2[6] + fArr2[7];
        fArr[26] = f46 - f47;
        float f48 = (((-fArr2[8]) - fArr2[12]) - fArr2[14]) - fArr2[15];
        fArr[30] = f48 - fArr2[0];
        fArr[28] = f48 - f47;
        float[] fArr5 = this.c;
        int i2 = this.d;
        fArr5[i2 + 0] = fArr[0];
        fArr5[i2 + 16] = fArr[1];
        fArr5[i2 + 32] = fArr[2];
        fArr5[i2 + 48] = fArr[3];
        fArr5[i2 + 64] = fArr[4];
        fArr5[i2 + 80] = fArr[5];
        fArr5[i2 + 96] = fArr[6];
        fArr5[i2 + 112] = fArr[7];
        fArr5[i2 + 128] = fArr[8];
        fArr5[i2 + 144] = fArr[9];
        fArr5[i2 + 160] = fArr[10];
        fArr5[i2 + DataTypeSource.SPORT_TYPE_BRIDGE] = fArr[11];
        fArr5[i2 + 192] = fArr[12];
        fArr5[i2 + 208] = fArr[13];
        fArr5[i2 + 224] = fArr[14];
        fArr5[i2 + 240] = fArr[15];
        fArr5[i2 + 256] = 0.0f;
        fArr5[i2 + 272] = -fArr[15];
        fArr5[i2 + 288] = -fArr[14];
        fArr5[i2 + 304] = -fArr[13];
        fArr5[i2 + GlMapUtil.DEVICE_DISPLAY_DPI_HIGH] = -fArr[12];
        fArr5[i2 + 336] = -fArr[11];
        fArr5[i2 + 352] = -fArr[10];
        fArr5[i2 + 368] = -fArr[9];
        fArr5[i2 + 384] = -fArr[8];
        fArr5[i2 + 400] = -fArr[7];
        fArr5[i2 + 416] = -fArr[6];
        fArr5[i2 + 432] = -fArr[5];
        fArr5[i2 + 448] = -fArr[4];
        fArr5[i2 + 464] = -fArr[3];
        fArr5[i2 + 480] = -fArr[2];
        fArr5[i2 + 496] = -fArr[1];
    }

    private void d(Obuffer obuffer) {
        switch (this.d) {
            case 0:
                e(obuffer);
                break;
            case 1:
                f(obuffer);
                break;
            case 2:
                m(obuffer);
                break;
            case 3:
                n(obuffer);
                break;
            case 4:
                o(obuffer);
                break;
            case 5:
                p(obuffer);
                break;
            case 6:
                q(obuffer);
                break;
            case 7:
                r(obuffer);
                break;
            case 8:
                s(obuffer);
                break;
            case 9:
                t(obuffer);
                break;
            case 10:
                g(obuffer);
                break;
            case 11:
                h(obuffer);
                break;
            case 12:
                i(obuffer);
                break;
            case 13:
                j(obuffer);
                break;
            case 14:
                k(obuffer);
                break;
            case 15:
                l(obuffer);
                break;
        }
        if (obuffer != null) {
            obuffer.appendSamples(this.f, this.i);
        }
    }

    private void e(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 0] * fArr3[0]) + (fArr[i + 15] * fArr3[1]) + (fArr[i + 14] * fArr3[2]) + (fArr[i + 13] * fArr3[3]) + (fArr[i + 12] * fArr3[4]) + (fArr[i + 11] * fArr3[5]) + (fArr[i + 10] * fArr3[6]) + (fArr[i + 9] * fArr3[7]) + (fArr[i + 8] * fArr3[8]) + (fArr[i + 7] * fArr3[9]) + (fArr[i + 6] * fArr3[10]) + (fArr[i + 5] * fArr3[11]) + (fArr[i + 4] * fArr3[12]) + (fArr[i + 3] * fArr3[13]) + (fArr[i + 2] * fArr3[14]) + (fArr[i + 1] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void f(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 1] * fArr3[0]) + (fArr[i + 0] * fArr3[1]) + (fArr[i + 15] * fArr3[2]) + (fArr[i + 14] * fArr3[3]) + (fArr[i + 13] * fArr3[4]) + (fArr[i + 12] * fArr3[5]) + (fArr[i + 11] * fArr3[6]) + (fArr[i + 10] * fArr3[7]) + (fArr[i + 9] * fArr3[8]) + (fArr[i + 8] * fArr3[9]) + (fArr[i + 7] * fArr3[10]) + (fArr[i + 6] * fArr3[11]) + (fArr[i + 5] * fArr3[12]) + (fArr[i + 4] * fArr3[13]) + (fArr[i + 3] * fArr3[14]) + (fArr[i + 2] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void g(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 10] * fArr3[0]) + (fArr[i + 9] * fArr3[1]) + (fArr[i + 8] * fArr3[2]) + (fArr[i + 7] * fArr3[3]) + (fArr[i + 6] * fArr3[4]) + (fArr[i + 5] * fArr3[5]) + (fArr[i + 4] * fArr3[6]) + (fArr[i + 3] * fArr3[7]) + (fArr[i + 2] * fArr3[8]) + (fArr[i + 1] * fArr3[9]) + (fArr[i + 0] * fArr3[10]) + (fArr[i + 15] * fArr3[11]) + (fArr[i + 14] * fArr3[12]) + (fArr[i + 13] * fArr3[13]) + (fArr[i + 12] * fArr3[14]) + (fArr[i + 11] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void h(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 11] * fArr3[0]) + (fArr[i + 10] * fArr3[1]) + (fArr[i + 9] * fArr3[2]) + (fArr[i + 8] * fArr3[3]) + (fArr[i + 7] * fArr3[4]) + (fArr[i + 6] * fArr3[5]) + (fArr[i + 5] * fArr3[6]) + (fArr[i + 4] * fArr3[7]) + (fArr[i + 3] * fArr3[8]) + (fArr[i + 2] * fArr3[9]) + (fArr[i + 1] * fArr3[10]) + (fArr[i + 0] * fArr3[11]) + (fArr[i + 15] * fArr3[12]) + (fArr[i + 14] * fArr3[13]) + (fArr[i + 13] * fArr3[14]) + (fArr[i + 12] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void i(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 12] * fArr3[0]) + (fArr[i + 11] * fArr3[1]) + (fArr[i + 10] * fArr3[2]) + (fArr[i + 9] * fArr3[3]) + (fArr[i + 8] * fArr3[4]) + (fArr[i + 7] * fArr3[5]) + (fArr[i + 6] * fArr3[6]) + (fArr[i + 5] * fArr3[7]) + (fArr[i + 4] * fArr3[8]) + (fArr[i + 3] * fArr3[9]) + (fArr[i + 2] * fArr3[10]) + (fArr[i + 1] * fArr3[11]) + (fArr[i + 0] * fArr3[12]) + (fArr[i + 15] * fArr3[13]) + (fArr[i + 14] * fArr3[14]) + (fArr[i + 13] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void j(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 13] * fArr3[0]) + (fArr[i + 12] * fArr3[1]) + (fArr[i + 11] * fArr3[2]) + (fArr[i + 10] * fArr3[3]) + (fArr[i + 9] * fArr3[4]) + (fArr[i + 8] * fArr3[5]) + (fArr[i + 7] * fArr3[6]) + (fArr[i + 6] * fArr3[7]) + (fArr[i + 5] * fArr3[8]) + (fArr[i + 4] * fArr3[9]) + (fArr[i + 3] * fArr3[10]) + (fArr[i + 2] * fArr3[11]) + (fArr[i + 1] * fArr3[12]) + (fArr[i + 0] * fArr3[13]) + (fArr[i + 15] * fArr3[14]) + (fArr[i + 14] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void k(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 14] * fArr3[0]) + (fArr[i + 13] * fArr3[1]) + (fArr[i + 12] * fArr3[2]) + (fArr[i + 11] * fArr3[3]) + (fArr[i + 10] * fArr3[4]) + (fArr[i + 9] * fArr3[5]) + (fArr[i + 8] * fArr3[6]) + (fArr[i + 7] * fArr3[7]) + (fArr[i + 6] * fArr3[8]) + (fArr[i + 5] * fArr3[9]) + (fArr[i + 4] * fArr3[10]) + (fArr[i + 3] * fArr3[11]) + (fArr[i + 2] * fArr3[12]) + (fArr[i + 1] * fArr3[13]) + (fArr[i + 0] * fArr3[14]) + (fArr[i + 15] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void l(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 15] * fArr3[0]) + (fArr[i + 14] * fArr3[1]) + (fArr[i + 13] * fArr3[2]) + (fArr[i + 12] * fArr3[3]) + (fArr[i + 11] * fArr3[4]) + (fArr[i + 10] * fArr3[5]) + (fArr[i + 9] * fArr3[6]) + (fArr[i + 8] * fArr3[7]) + (fArr[i + 7] * fArr3[8]) + (fArr[i + 6] * fArr3[9]) + (fArr[i + 5] * fArr3[10]) + (fArr[i + 4] * fArr3[11]) + (fArr[i + 3] * fArr3[12]) + (fArr[i + 2] * fArr3[13]) + (fArr[i + 1] * fArr3[14]) + (fArr[i + 0] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void m(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 2] * fArr3[0]) + (fArr[i + 1] * fArr3[1]) + (fArr[i + 0] * fArr3[2]) + (fArr[i + 15] * fArr3[3]) + (fArr[i + 14] * fArr3[4]) + (fArr[i + 13] * fArr3[5]) + (fArr[i + 12] * fArr3[6]) + (fArr[i + 11] * fArr3[7]) + (fArr[i + 10] * fArr3[8]) + (fArr[i + 9] * fArr3[9]) + (fArr[i + 8] * fArr3[10]) + (fArr[i + 7] * fArr3[11]) + (fArr[i + 6] * fArr3[12]) + (fArr[i + 5] * fArr3[13]) + (fArr[i + 4] * fArr3[14]) + (fArr[i + 3] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void n(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 3] * fArr3[0]) + (fArr[i + 2] * fArr3[1]) + (fArr[i + 1] * fArr3[2]) + (fArr[i + 0] * fArr3[3]) + (fArr[i + 15] * fArr3[4]) + (fArr[i + 14] * fArr3[5]) + (fArr[i + 13] * fArr3[6]) + (fArr[i + 12] * fArr3[7]) + (fArr[i + 11] * fArr3[8]) + (fArr[i + 10] * fArr3[9]) + (fArr[i + 9] * fArr3[10]) + (fArr[i + 8] * fArr3[11]) + (fArr[i + 7] * fArr3[12]) + (fArr[i + 6] * fArr3[13]) + (fArr[i + 5] * fArr3[14]) + (fArr[i + 4] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void o(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 4] * fArr3[0]) + (fArr[i + 3] * fArr3[1]) + (fArr[i + 2] * fArr3[2]) + (fArr[i + 1] * fArr3[3]) + (fArr[i + 0] * fArr3[4]) + (fArr[i + 15] * fArr3[5]) + (fArr[i + 14] * fArr3[6]) + (fArr[i + 13] * fArr3[7]) + (fArr[i + 12] * fArr3[8]) + (fArr[i + 11] * fArr3[9]) + (fArr[i + 10] * fArr3[10]) + (fArr[i + 9] * fArr3[11]) + (fArr[i + 8] * fArr3[12]) + (fArr[i + 7] * fArr3[13]) + (fArr[i + 6] * fArr3[14]) + (fArr[i + 5] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void p(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 5] * fArr3[0]) + (fArr[i + 4] * fArr3[1]) + (fArr[i + 3] * fArr3[2]) + (fArr[i + 2] * fArr3[3]) + (fArr[i + 1] * fArr3[4]) + (fArr[i + 0] * fArr3[5]) + (fArr[i + 15] * fArr3[6]) + (fArr[i + 14] * fArr3[7]) + (fArr[i + 13] * fArr3[8]) + (fArr[i + 12] * fArr3[9]) + (fArr[i + 11] * fArr3[10]) + (fArr[i + 10] * fArr3[11]) + (fArr[i + 9] * fArr3[12]) + (fArr[i + 8] * fArr3[13]) + (fArr[i + 7] * fArr3[14]) + (fArr[i + 6] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void q(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 6] * fArr3[0]) + (fArr[i + 5] * fArr3[1]) + (fArr[i + 4] * fArr3[2]) + (fArr[i + 3] * fArr3[3]) + (fArr[i + 2] * fArr3[4]) + (fArr[i + 1] * fArr3[5]) + (fArr[i + 0] * fArr3[6]) + (fArr[i + 15] * fArr3[7]) + (fArr[i + 14] * fArr3[8]) + (fArr[i + 13] * fArr3[9]) + (fArr[i + 12] * fArr3[10]) + (fArr[i + 11] * fArr3[11]) + (fArr[i + 10] * fArr3[12]) + (fArr[i + 9] * fArr3[13]) + (fArr[i + 8] * fArr3[14]) + (fArr[i + 7] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void r(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 7] * fArr3[0]) + (fArr[i + 6] * fArr3[1]) + (fArr[i + 5] * fArr3[2]) + (fArr[i + 4] * fArr3[3]) + (fArr[i + 3] * fArr3[4]) + (fArr[i + 2] * fArr3[5]) + (fArr[i + 1] * fArr3[6]) + (fArr[i + 0] * fArr3[7]) + (fArr[i + 15] * fArr3[8]) + (fArr[i + 14] * fArr3[9]) + (fArr[i + 13] * fArr3[10]) + (fArr[i + 12] * fArr3[11]) + (fArr[i + 11] * fArr3[12]) + (fArr[i + 10] * fArr3[13]) + (fArr[i + 9] * fArr3[14]) + (fArr[i + 8] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void s(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 8] * fArr3[0]) + (fArr[i + 7] * fArr3[1]) + (fArr[i + 6] * fArr3[2]) + (fArr[i + 5] * fArr3[3]) + (fArr[i + 4] * fArr3[4]) + (fArr[i + 3] * fArr3[5]) + (fArr[i + 2] * fArr3[6]) + (fArr[i + 1] * fArr3[7]) + (fArr[i + 0] * fArr3[8]) + (fArr[i + 15] * fArr3[9]) + (fArr[i + 14] * fArr3[10]) + (fArr[i + 13] * fArr3[11]) + (fArr[i + 12] * fArr3[12]) + (fArr[i + 11] * fArr3[13]) + (fArr[i + 10] * fArr3[14]) + (fArr[i + 9] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private void t(Obuffer obuffer) {
        float[] fArr = this.c;
        float[] fArr2 = this.i;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = Q[i2];
            fArr2[i2] = ((fArr[i + 9] * fArr3[0]) + (fArr[i + 8] * fArr3[1]) + (fArr[i + 7] * fArr3[2]) + (fArr[i + 6] * fArr3[3]) + (fArr[i + 5] * fArr3[4]) + (fArr[i + 4] * fArr3[5]) + (fArr[i + 3] * fArr3[6]) + (fArr[i + 2] * fArr3[7]) + (fArr[i + 1] * fArr3[8]) + (fArr[i + 0] * fArr3[9]) + (fArr[i + 15] * fArr3[10]) + (fArr[i + 14] * fArr3[11]) + (fArr[i + 13] * fArr3[12]) + (fArr[i + 12] * fArr3[13]) + (fArr[i + 11] * fArr3[14]) + (fArr[i + 10] * fArr3[15])) * this.g;
            i += 16;
        }
    }

    private static float[] w() {
        try {
            return (float[]) JavaLayerUtils.deserializeArrayResource("sfd.ser", Float.TYPE, 512);
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private static float[][] z(float[] fArr, int i) {
        int length = fArr.length / i;
        float[][] fArr2 = new float[length][];
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = A(fArr, i2 * i, i);
        }
        return fArr2;
    }

    public void a(Obuffer obuffer) {
        b();
        d(obuffer);
        this.d = (this.d + 1) & 15;
        float[] fArr = this.c;
        float[] fArr2 = this.a;
        if (fArr == fArr2) {
            fArr2 = this.b;
        }
        this.c = fArr2;
        for (int i = 0; i < 32; i++) {
            this.e[i] = 0.0f;
        }
    }

    public void u(float f, int i) {
        this.e[i] = this.h[i] * f;
    }

    public void v(float[] fArr) {
        for (int i = 31; i >= 0; i--) {
            this.e[i] = fArr[i] * this.h[i];
        }
    }

    public void x() {
        for (int i = 0; i < 512; i++) {
            float[] fArr = this.a;
            this.b[i] = 0.0f;
            fArr[i] = 0.0f;
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.e[i2] = 0.0f;
        }
        this.c = this.a;
        this.d = 15;
    }

    public void y(float[] fArr) {
        this.h = fArr;
        if (fArr == null) {
            this.h = new float[32];
            for (int i = 0; i < 32; i++) {
                this.h[i] = 1.0f;
            }
        }
        if (this.h.length < 32) {
            throw new IllegalArgumentException("eq0");
        }
    }
}
