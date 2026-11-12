package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzfz;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzom;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class s0 implements Callable<byte[]> {
    public final /* synthetic */ zzat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzgn c;

    public s0(zzgn zzgnVar, zzat zzatVar, String str) {
        this.c = zzgnVar;
        this.a = zzatVar;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0336 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x034c A[LOOP:1: B:99:0x0330->B:104:0x034c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0379 A[Catch: all -> 0x05ff, LOOP:2: B:107:0x0373->B:109:0x0379, LOOP_END, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0418 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0440 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0476 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x04c6 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0532 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0548 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0553 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0557 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0559 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x04c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0217 A[Catch: all -> 0x05ff, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0254 A[Catch: SecurityException -> 0x05e3, all -> 0x05ff, TryCatch #0 {SecurityException -> 0x05e3, blocks: (B:72:0x024e, B:74:0x0254, B:76:0x025a), top: B:147:0x024e, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x027b A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x02a0 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02b6 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02ba A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0304 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0311 A[Catch: all -> 0x05ff, TryCatch #3 {all -> 0x05ff, blocks: (B:11:0x007e, B:13:0x008a, B:16:0x00a6, B:18:0x00ac, B:20:0x00c0, B:22:0x00d7, B:23:0x00de, B:25:0x00e8, B:26:0x00f5, B:28:0x00ff, B:29:0x010c, B:31:0x0117, B:32:0x011f, B:34:0x014a, B:36:0x0154, B:49:0x017f, B:51:0x0194, B:53:0x01a4, B:55:0x01aa, B:57:0x01b0, B:58:0x01b3, B:60:0x01c0, B:62:0x01d4, B:64:0x01de, B:65:0x01ef, B:67:0x01f3, B:69:0x01fe, B:71:0x0217, B:72:0x024e, B:74:0x0254, B:76:0x025a, B:77:0x0271, B:79:0x027b, B:80:0x0288, B:81:0x029a, B:83:0x02a0, B:89:0x02b6, B:92:0x02e1, B:94:0x0304, B:96:0x0311, B:98:0x031d, B:99:0x0330, B:101:0x0336, B:103:0x0348, B:105:0x034e, B:106:0x036c, B:107:0x0373, B:109:0x0379, B:110:0x03b1, B:112:0x0418, B:113:0x0432, B:115:0x0440, B:117:0x048b, B:118:0x04c0, B:120:0x04c6, B:122:0x04d9, B:123:0x04e6, B:125:0x0532, B:126:0x0540, B:128:0x0548, B:129:0x054b, B:131:0x0553, B:134:0x055c, B:133:0x0559, B:116:0x0476, B:91:0x02ba, B:141:0x05e4, B:37:0x0158, B:39:0x015e, B:40:0x0162, B:42:0x0168, B:43:0x016c, B:45:0x0172, B:46:0x0176, B:48:0x017c), top: B:153:0x007e, inners: #0, #1 }] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ byte[] call() throws Exception {
        byte[] bArr;
        zzks zzksVar;
        String strE0;
        List<b4> listR;
        Iterator<b4> it2;
        b4 next;
        zzku zzkuVarZzu;
        zzgh[] zzghVarArr;
        int i;
        Bundle bundle;
        g gVarL;
        byte[] bArr2;
        g gVarC;
        long j;
        zzao zzaoVar;
        com.google.android.gms.internal.measurement.zzfn zzfnVarZze;
        h hVar;
        long jY;
        long jA0;
        zzfr zzfrVarZze;
        Object objD;
        String strE1;
        Iterator<b4> it3;
        this.c.a.a();
        b2 b2VarZzr = this.c.a.zzr();
        zzat zzatVar = this.a;
        String str = this.b;
        b2VarZzr.zzg();
        zzfv.f();
        Preconditions.checkNotNull(zzatVar);
        Preconditions.checkNotEmpty(str);
        if (!b2VarZzr.zzs.zzf().zzs(str, zzdy.zzU)) {
            b2VarZzr.zzs.zzay().zzc().zzb("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzatVar.zza) && !"_iapx".equals(zzatVar.zza)) {
            b2VarZzr.zzs.zzay().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str, zzatVar.zza);
            return null;
        }
        com.google.android.gms.internal.measurement.zzfv zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
        b2VarZzr.zzf.zzi().zzw();
        try {
            j0 j0VarH = b2VarZzr.zzf.zzi().H(str);
            if (j0VarH == null) {
                b2VarZzr.zzs.zzay().zzc().zzb("Log and bundle not available. package_name", str);
                bArr = new byte[0];
                zzksVar = b2VarZzr.zzf;
            } else if (j0VarH.K()) {
                zzfx zzfxVarZzu = zzfy.zzu();
                zzfxVarZzu.zzaa(1);
                zzfxVarZzu.zzW("android");
                if (!TextUtils.isEmpty(j0VarH.e0())) {
                    zzfxVarZzu.zzA(j0VarH.e0());
                }
                if (!TextUtils.isEmpty(j0VarH.g0())) {
                    zzfxVarZzu.zzC((String) Preconditions.checkNotNull(j0VarH.g0()));
                }
                if (!TextUtils.isEmpty(j0VarH.h0())) {
                    zzfxVarZzu.zzD((String) Preconditions.checkNotNull(j0VarH.h0()));
                }
                if (j0VarH.M() != ParserMinimalBase.MIN_INT_L) {
                    zzfxVarZzu.zzE((int) j0VarH.M());
                }
                zzfxVarZzu.zzS(j0VarH.X());
                zzfxVarZzu.zzM(j0VarH.V());
                String strK0 = j0VarH.k0();
                String strC0 = j0VarH.c0();
                zzom.zzc();
                if (b2VarZzr.zzs.zzf().zzs(j0VarH.e0(), zzdy.zzac)) {
                    String strJ0 = j0VarH.j0();
                    if (!TextUtils.isEmpty(strK0)) {
                        zzfxVarZzu.zzR(strK0);
                    } else if (!TextUtils.isEmpty(strJ0)) {
                        zzfxVarZzu.zzQ(strJ0);
                    } else if (!TextUtils.isEmpty(strC0)) {
                        zzfxVarZzu.zzy(strC0);
                    }
                } else if (!TextUtils.isEmpty(strK0)) {
                    zzfxVarZzu.zzR(strK0);
                } else if (!TextUtils.isEmpty(strC0)) {
                    zzfxVarZzu.zzy(strC0);
                }
                zzag zzagVarM = b2VarZzr.zzf.M(str);
                zzfxVarZzu.zzJ(j0VarH.U());
                if (b2VarZzr.zzs.zzJ() && b2VarZzr.zzs.zzf().zzt(zzfxVarZzu.zzal()) && zzagVarM.zzj() && !TextUtils.isEmpty(null)) {
                    zzfxVarZzu.zzL(null);
                }
                zzfxVarZzu.zzI(zzagVarM.zzi());
                if (!zzagVarM.zzj()) {
                    b2VarZzr.zzs.zzg().zzu();
                    zzfxVarZzu.zzK(Build.MODEL);
                    b2VarZzr.zzs.zzg().zzu();
                    zzfxVarZzu.zzV(Build.VERSION.RELEASE);
                    zzfxVarZzu.zzaf((int) b2VarZzr.zzs.zzg().zzb());
                    zzfxVarZzu.zzaj(b2VarZzr.zzs.zzg().zzc());
                    if (zzagVarM.zzk()) {
                        zzfxVarZzu.zzB(b2.zza((String) Preconditions.checkNotNull(j0VarH.f0()), Long.toString(zzatVar.zzd)));
                    }
                    if (!TextUtils.isEmpty(j0VarH.i0())) {
                        zzfxVarZzu.zzP((String) Preconditions.checkNotNull(j0VarH.i0()));
                    }
                    strE0 = j0VarH.e0();
                    listR = b2VarZzr.zzf.zzi().R(strE0);
                    it2 = listR.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!"_lte".equals(next.c));
                    if (next != null) {
                        b4 b4Var = new b4(strE0, "auto", "_lte", b2VarZzr.zzs.zzav().currentTimeMillis(), 0L);
                        listR.add(b4Var);
                        b2VarZzr.zzf.zzi().n(b4Var);
                    } else {
                        b4 b4Var2 = new b4(strE0, "auto", "_lte", b2VarZzr.zzs.zzav().currentTimeMillis(), 0L);
                        listR.add(b4Var2);
                        b2VarZzr.zzf.zzi().n(b4Var2);
                    }
                    zzkuVarZzu = b2VarZzr.zzf.zzu();
                    zzkuVarZzu.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                    if (zzkuVarZzu.zzs.zzg().c()) {
                        strE1 = j0VarH.e0();
                        Preconditions.checkNotNull(strE1);
                        if (j0VarH.J()) {
                            zzkuVarZzu.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                            it3 = listR.iterator();
                            while (it3.hasNext()) {
                                if ("_npa".equals(it3.next().c)) {
                                    it3.remove();
                                    break;
                                }
                            }
                            listR.add(new b4(strE1, "auto", "_npa", zzkuVarZzu.zzs.zzav().currentTimeMillis(), 1L));
                        }
                    }
                    zzghVarArr = new zzgh[listR.size()];
                    for (i = 0; i < listR.size(); i++) {
                        zzgg zzggVarZzd = zzgh.zzd();
                        zzggVarZzd.zzf(listR.get(i).c);
                        zzggVarZzd.zzg(listR.get(i).d);
                        b2VarZzr.zzf.zzu().B(zzggVarZzd, listR.get(i).e);
                        zzghVarArr[i] = zzggVarZzd.zzaA();
                    }
                    zzfxVarZzu.zzi(Arrays.asList(zzghVarArr));
                    zzem zzemVarZzb = zzem.zzb(zzatVar);
                    b2VarZzr.zzs.zzv().h(zzemVarZzb.zzd, b2VarZzr.zzf.zzi().G(str));
                    b2VarZzr.zzs.zzv().i(zzemVarZzb, b2VarZzr.zzs.zzf().zzd(str));
                    bundle = zzemVarZzb.zzd;
                    bundle.putLong("_c", 1L);
                    b2VarZzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                    bundle.putLong("_r", 1L);
                    bundle.putString(com.google.firebase.crashlytics.a.c, zzatVar.zzc);
                    if (b2VarZzr.zzs.zzv().u(zzfxVarZzu.zzal())) {
                        b2VarZzr.zzs.zzv().k(bundle, "_dbg", 1L);
                        b2VarZzr.zzs.zzv().k(bundle, "_r", 1L);
                    }
                    gVarL = b2VarZzr.zzf.zzi().L(str, zzatVar.zza);
                    if (gVarL == null) {
                        bArr2 = null;
                        gVarC = new g(str, zzatVar.zza, 0L, 0L, 0L, zzatVar.zzd, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        bArr2 = null;
                        long j2 = gVarL.f;
                        gVarC = gVarL.c(zzatVar.zzd);
                        j = j2;
                    }
                    b2VarZzr.zzf.zzi().f(gVarC);
                    zzaoVar = new zzao(b2VarZzr.zzs, zzatVar.zzc, str, zzatVar.zza, zzatVar.zzd, j, bundle);
                    zzfnVarZze = zzfo.zze();
                    zzfnVarZze.zzm(zzaoVar.d);
                    zzfnVarZze.zzi(zzaoVar.b);
                    zzfnVarZze.zzl(zzaoVar.e);
                    hVar = new h(zzaoVar.f);
                    while (hVar.hasNext()) {
                        String next2 = hVar.next();
                        zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
                        zzfrVarZze.zzj(next2);
                        objD = zzaoVar.f.d(next2);
                        if (objD != null) {
                            b2VarZzr.zzf.zzu().A(zzfrVarZze, objD);
                            zzfnVarZze.zze(zzfrVarZze);
                        }
                    }
                    zzfxVarZzu.zzj(zzfnVarZze);
                    zzfz zzfzVarZza = zzgb.zza();
                    zzfp zzfpVarZza = zzfq.zza();
                    zzfpVarZza.zza(gVarC.c);
                    zzfpVarZza.zzb(zzatVar.zza);
                    zzfzVarZza.zza(zzfpVarZza);
                    zzfxVarZzu.zzX(zzfzVarZza);
                    zzfxVarZzu.zzf(b2VarZzr.zzf.zzf().b(j0VarH.e0(), Collections.emptyList(), zzfxVarZzu.zzap(), Long.valueOf(zzfnVarZze.zzc()), Long.valueOf(zzfnVarZze.zzc())));
                    if (zzfnVarZze.zzq()) {
                        zzfxVarZzu.zzae(zzfnVarZze.zzc());
                        zzfxVarZzu.zzN(zzfnVarZze.zzc());
                    }
                    jY = j0VarH.Y();
                    if (jY != 0) {
                        zzfxVarZzu.zzY(jY);
                    }
                    jA0 = j0VarH.a0();
                    if (jA0 != 0) {
                        zzfxVarZzu.zzZ(jA0);
                    } else if (jY != 0) {
                        zzfxVarZzu.zzZ(jY);
                    }
                    j0VarH.e();
                    zzfxVarZzu.zzF((int) j0VarH.Z());
                    b2VarZzr.zzs.zzf().zzh();
                    zzfxVarZzu.zzah(46000L);
                    zzfxVarZzu.zzag(b2VarZzr.zzs.zzav().currentTimeMillis());
                    zzfxVarZzu.zzad(true);
                    zzfvVarZza.zza(zzfxVarZzu);
                    j0VarH.E(zzfxVarZzu.zzd());
                    j0VarH.C(zzfxVarZzu.zzc());
                    b2VarZzr.zzf.zzi().e(j0VarH);
                    b2VarZzr.zzf.zzi().d();
                    b2VarZzr.zzf.zzi().zzy();
                    return b2VarZzr.zzf.zzu().F(zzfvVarZza.zzaA().zzbs());
                }
                Pair<String, Boolean> pairC = b2VarZzr.zzf.zzs().c(j0VarH.e0(), zzagVarM);
                if (!j0VarH.J() || TextUtils.isEmpty((CharSequence) pairC.first)) {
                    b2VarZzr.zzs.zzg().zzu();
                    zzfxVarZzu.zzK(Build.MODEL);
                    b2VarZzr.zzs.zzg().zzu();
                    zzfxVarZzu.zzV(Build.VERSION.RELEASE);
                    zzfxVarZzu.zzaf((int) b2VarZzr.zzs.zzg().zzb());
                    zzfxVarZzu.zzaj(b2VarZzr.zzs.zzg().zzc());
                    try {
                        if (zzagVarM.zzk() && j0VarH.f0() != null) {
                            zzfxVarZzu.zzB(b2.zza((String) Preconditions.checkNotNull(j0VarH.f0()), Long.toString(zzatVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(j0VarH.i0())) {
                            zzfxVarZzu.zzP((String) Preconditions.checkNotNull(j0VarH.i0()));
                        }
                        strE0 = j0VarH.e0();
                        listR = b2VarZzr.zzf.zzi().R(strE0);
                        it2 = listR.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!"_lte".equals(next.c));
                        if (next != null || next.e == null) {
                            b4 b4Var3 = new b4(strE0, "auto", "_lte", b2VarZzr.zzs.zzav().currentTimeMillis(), 0L);
                            listR.add(b4Var3);
                            b2VarZzr.zzf.zzi().n(b4Var3);
                        }
                        zzkuVarZzu = b2VarZzr.zzf.zzu();
                        zzkuVarZzu.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzkuVarZzu.zzs.zzg().c()) {
                            strE1 = j0VarH.e0();
                            Preconditions.checkNotNull(strE1);
                            if (j0VarH.J() && zzkuVarZzu.zzf.zzo().f(strE1)) {
                                zzkuVarZzu.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                                it3 = listR.iterator();
                                while (it3.hasNext()) {
                                    if ("_npa".equals(it3.next().c)) {
                                        it3.remove();
                                        break;
                                    }
                                }
                                listR.add(new b4(strE1, "auto", "_npa", zzkuVarZzu.zzs.zzav().currentTimeMillis(), 1L));
                            }
                        }
                        zzghVarArr = new zzgh[listR.size()];
                        while (i < listR.size()) {
                            zzgg zzggVarZzd2 = zzgh.zzd();
                            zzggVarZzd2.zzf(listR.get(i).c);
                            zzggVarZzd2.zzg(listR.get(i).d);
                            b2VarZzr.zzf.zzu().B(zzggVarZzd2, listR.get(i).e);
                            zzghVarArr[i] = zzggVarZzd2.zzaA();
                        }
                        zzfxVarZzu.zzi(Arrays.asList(zzghVarArr));
                        zzem zzemVarZzb2 = zzem.zzb(zzatVar);
                        b2VarZzr.zzs.zzv().h(zzemVarZzb2.zzd, b2VarZzr.zzf.zzi().G(str));
                        b2VarZzr.zzs.zzv().i(zzemVarZzb2, b2VarZzr.zzs.zzf().zzd(str));
                        bundle = zzemVarZzb2.zzd;
                        bundle.putLong("_c", 1L);
                        b2VarZzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                        bundle.putLong("_r", 1L);
                        bundle.putString(com.google.firebase.crashlytics.a.c, zzatVar.zzc);
                        if (b2VarZzr.zzs.zzv().u(zzfxVarZzu.zzal())) {
                            b2VarZzr.zzs.zzv().k(bundle, "_dbg", 1L);
                            b2VarZzr.zzs.zzv().k(bundle, "_r", 1L);
                        }
                        gVarL = b2VarZzr.zzf.zzi().L(str, zzatVar.zza);
                        if (gVarL == null) {
                            bArr2 = null;
                            gVarC = new g(str, zzatVar.zza, 0L, 0L, 0L, zzatVar.zzd, 0L, null, null, null, null);
                            j = 0;
                        } else {
                            bArr2 = null;
                            long j3 = gVarL.f;
                            gVarC = gVarL.c(zzatVar.zzd);
                            j = j3;
                        }
                        b2VarZzr.zzf.zzi().f(gVarC);
                        zzaoVar = new zzao(b2VarZzr.zzs, zzatVar.zzc, str, zzatVar.zza, zzatVar.zzd, j, bundle);
                        zzfnVarZze = zzfo.zze();
                        zzfnVarZze.zzm(zzaoVar.d);
                        zzfnVarZze.zzi(zzaoVar.b);
                        zzfnVarZze.zzl(zzaoVar.e);
                        hVar = new h(zzaoVar.f);
                        while (hVar.hasNext()) {
                            String next3 = hVar.next();
                            zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
                            zzfrVarZze.zzj(next3);
                            objD = zzaoVar.f.d(next3);
                            if (objD != null) {
                                b2VarZzr.zzf.zzu().A(zzfrVarZze, objD);
                                zzfnVarZze.zze(zzfrVarZze);
                            }
                        }
                        zzfxVarZzu.zzj(zzfnVarZze);
                        zzfz zzfzVarZza2 = zzgb.zza();
                        zzfp zzfpVarZza2 = zzfq.zza();
                        zzfpVarZza2.zza(gVarC.c);
                        zzfpVarZza2.zzb(zzatVar.zza);
                        zzfzVarZza2.zza(zzfpVarZza2);
                        zzfxVarZzu.zzX(zzfzVarZza2);
                        zzfxVarZzu.zzf(b2VarZzr.zzf.zzf().b(j0VarH.e0(), Collections.emptyList(), zzfxVarZzu.zzap(), Long.valueOf(zzfnVarZze.zzc()), Long.valueOf(zzfnVarZze.zzc())));
                        if (zzfnVarZze.zzq()) {
                            zzfxVarZzu.zzae(zzfnVarZze.zzc());
                            zzfxVarZzu.zzN(zzfnVarZze.zzc());
                        }
                        jY = j0VarH.Y();
                        if (jY != 0) {
                            zzfxVarZzu.zzY(jY);
                        }
                        jA0 = j0VarH.a0();
                        if (jA0 != 0) {
                            zzfxVarZzu.zzZ(jA0);
                        } else if (jY != 0) {
                            zzfxVarZzu.zzZ(jY);
                        }
                        j0VarH.e();
                        zzfxVarZzu.zzF((int) j0VarH.Z());
                        b2VarZzr.zzs.zzf().zzh();
                        zzfxVarZzu.zzah(46000L);
                        zzfxVarZzu.zzag(b2VarZzr.zzs.zzav().currentTimeMillis());
                        zzfxVarZzu.zzad(true);
                        zzfvVarZza.zza(zzfxVarZzu);
                        j0VarH.E(zzfxVarZzu.zzd());
                        j0VarH.C(zzfxVarZzu.zzc());
                        b2VarZzr.zzf.zzi().e(j0VarH);
                        b2VarZzr.zzf.zzi().d();
                        b2VarZzr.zzf.zzi().zzy();
                        try {
                            return b2VarZzr.zzf.zzu().F(zzfvVarZza.zzaA().zzbs());
                        } catch (IOException e) {
                            b2VarZzr.zzs.zzay().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzel.zzn(str), e);
                            return bArr2;
                        }
                    } catch (SecurityException e2) {
                        b2VarZzr.zzs.zzay().zzc().zzb("app instance id encryption failed", e2.getMessage());
                        bArr = new byte[0];
                        zzksVar = b2VarZzr.zzf;
                    }
                } else {
                    try {
                        zzfxVarZzu.zzab(b2.zza((String) pairC.first, Long.toString(zzatVar.zzd)));
                        Object obj = pairC.second;
                        if (obj != null) {
                            zzfxVarZzu.zzU(((Boolean) obj).booleanValue());
                        }
                        b2VarZzr.zzs.zzg().zzu();
                        zzfxVarZzu.zzK(Build.MODEL);
                        b2VarZzr.zzs.zzg().zzu();
                        zzfxVarZzu.zzV(Build.VERSION.RELEASE);
                        zzfxVarZzu.zzaf((int) b2VarZzr.zzs.zzg().zzb());
                        zzfxVarZzu.zzaj(b2VarZzr.zzs.zzg().zzc());
                        if (zzagVarM.zzk()) {
                            zzfxVarZzu.zzB(b2.zza((String) Preconditions.checkNotNull(j0VarH.f0()), Long.toString(zzatVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(j0VarH.i0())) {
                            zzfxVarZzu.zzP((String) Preconditions.checkNotNull(j0VarH.i0()));
                        }
                        strE0 = j0VarH.e0();
                        listR = b2VarZzr.zzf.zzi().R(strE0);
                        it2 = listR.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!"_lte".equals(next.c));
                        if (next != null) {
                            b4 b4Var4 = new b4(strE0, "auto", "_lte", b2VarZzr.zzs.zzav().currentTimeMillis(), 0L);
                            listR.add(b4Var4);
                            b2VarZzr.zzf.zzi().n(b4Var4);
                        } else {
                            b4 b4Var5 = new b4(strE0, "auto", "_lte", b2VarZzr.zzs.zzav().currentTimeMillis(), 0L);
                            listR.add(b4Var5);
                            b2VarZzr.zzf.zzi().n(b4Var5);
                        }
                        zzkuVarZzu = b2VarZzr.zzf.zzu();
                        zzkuVarZzu.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzkuVarZzu.zzs.zzg().c()) {
                            strE1 = j0VarH.e0();
                            Preconditions.checkNotNull(strE1);
                            if (j0VarH.J()) {
                                zzkuVarZzu.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                                it3 = listR.iterator();
                                while (it3.hasNext()) {
                                    if ("_npa".equals(it3.next().c)) {
                                        it3.remove();
                                        break;
                                    }
                                }
                                listR.add(new b4(strE1, "auto", "_npa", zzkuVarZzu.zzs.zzav().currentTimeMillis(), 1L));
                            }
                        }
                        zzghVarArr = new zzgh[listR.size()];
                        while (i < listR.size()) {
                            zzgg zzggVarZzd3 = zzgh.zzd();
                            zzggVarZzd3.zzf(listR.get(i).c);
                            zzggVarZzd3.zzg(listR.get(i).d);
                            b2VarZzr.zzf.zzu().B(zzggVarZzd3, listR.get(i).e);
                            zzghVarArr[i] = zzggVarZzd3.zzaA();
                        }
                        zzfxVarZzu.zzi(Arrays.asList(zzghVarArr));
                        zzem zzemVarZzb3 = zzem.zzb(zzatVar);
                        b2VarZzr.zzs.zzv().h(zzemVarZzb3.zzd, b2VarZzr.zzf.zzi().G(str));
                        b2VarZzr.zzs.zzv().i(zzemVarZzb3, b2VarZzr.zzs.zzf().zzd(str));
                        bundle = zzemVarZzb3.zzd;
                        bundle.putLong("_c", 1L);
                        b2VarZzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                        bundle.putLong("_r", 1L);
                        bundle.putString(com.google.firebase.crashlytics.a.c, zzatVar.zzc);
                        if (b2VarZzr.zzs.zzv().u(zzfxVarZzu.zzal())) {
                            b2VarZzr.zzs.zzv().k(bundle, "_dbg", 1L);
                            b2VarZzr.zzs.zzv().k(bundle, "_r", 1L);
                        }
                        gVarL = b2VarZzr.zzf.zzi().L(str, zzatVar.zza);
                        if (gVarL == null) {
                            bArr2 = null;
                            gVarC = new g(str, zzatVar.zza, 0L, 0L, 0L, zzatVar.zzd, 0L, null, null, null, null);
                            j = 0;
                        } else {
                            bArr2 = null;
                            long j4 = gVarL.f;
                            gVarC = gVarL.c(zzatVar.zzd);
                            j = j4;
                        }
                        b2VarZzr.zzf.zzi().f(gVarC);
                        zzaoVar = new zzao(b2VarZzr.zzs, zzatVar.zzc, str, zzatVar.zza, zzatVar.zzd, j, bundle);
                        zzfnVarZze = zzfo.zze();
                        zzfnVarZze.zzm(zzaoVar.d);
                        zzfnVarZze.zzi(zzaoVar.b);
                        zzfnVarZze.zzl(zzaoVar.e);
                        hVar = new h(zzaoVar.f);
                        while (hVar.hasNext()) {
                            String next4 = hVar.next();
                            zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
                            zzfrVarZze.zzj(next4);
                            objD = zzaoVar.f.d(next4);
                            if (objD != null) {
                                b2VarZzr.zzf.zzu().A(zzfrVarZze, objD);
                                zzfnVarZze.zze(zzfrVarZze);
                            }
                        }
                        zzfxVarZzu.zzj(zzfnVarZze);
                        zzfz zzfzVarZza3 = zzgb.zza();
                        zzfp zzfpVarZza3 = zzfq.zza();
                        zzfpVarZza3.zza(gVarC.c);
                        zzfpVarZza3.zzb(zzatVar.zza);
                        zzfzVarZza3.zza(zzfpVarZza3);
                        zzfxVarZzu.zzX(zzfzVarZza3);
                        zzfxVarZzu.zzf(b2VarZzr.zzf.zzf().b(j0VarH.e0(), Collections.emptyList(), zzfxVarZzu.zzap(), Long.valueOf(zzfnVarZze.zzc()), Long.valueOf(zzfnVarZze.zzc())));
                        if (zzfnVarZze.zzq()) {
                            zzfxVarZzu.zzae(zzfnVarZze.zzc());
                            zzfxVarZzu.zzN(zzfnVarZze.zzc());
                        }
                        jY = j0VarH.Y();
                        if (jY != 0) {
                            zzfxVarZzu.zzY(jY);
                        }
                        jA0 = j0VarH.a0();
                        if (jA0 != 0) {
                            zzfxVarZzu.zzZ(jA0);
                        } else if (jY != 0) {
                            zzfxVarZzu.zzZ(jY);
                        }
                        j0VarH.e();
                        zzfxVarZzu.zzF((int) j0VarH.Z());
                        b2VarZzr.zzs.zzf().zzh();
                        zzfxVarZzu.zzah(46000L);
                        zzfxVarZzu.zzag(b2VarZzr.zzs.zzav().currentTimeMillis());
                        zzfxVarZzu.zzad(true);
                        zzfvVarZza.zza(zzfxVarZzu);
                        j0VarH.E(zzfxVarZzu.zzd());
                        j0VarH.C(zzfxVarZzu.zzc());
                        b2VarZzr.zzf.zzi().e(j0VarH);
                        b2VarZzr.zzf.zzi().d();
                        b2VarZzr.zzf.zzi().zzy();
                        return b2VarZzr.zzf.zzu().F(zzfvVarZza.zzaA().zzbs());
                    } catch (SecurityException e3) {
                        b2VarZzr.zzs.zzay().zzc().zzb("Resettable device id encryption failed", e3.getMessage());
                        bArr = new byte[0];
                        zzksVar = b2VarZzr.zzf;
                    }
                }
            } else {
                b2VarZzr.zzs.zzay().zzc().zzb("Log and bundle disabled. package_name", str);
                bArr = new byte[0];
                zzksVar = b2VarZzr.zzf;
            }
            zzksVar.zzi().zzy();
            return bArr;
        } catch (Throwable th) {
            b2VarZzr.zzf.zzi().zzy();
            throw th;
        }
    }
}
