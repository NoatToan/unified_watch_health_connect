package com.garmin.android.library.connectdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.room.b0;
import androidx.room.x;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ConnectDatabase extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f50135a = LoggerFactory.getLogger("ConnectDatabase");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ConnectDatabase f50136b;

    public static class a extends kd.a {
        public a() {
            super(1, 2);
        }

        @Override // kd.a
        public final void migrate(vd.c cVar) {
            cVar.k3("CREATE TABLE IF NOT EXISTS 'canned_text_reply' ('deviceUnitId' INTEGER, 'replyText' TEXT, 'replyType' INTEGER, 'isOnDevice' INTEGER, 'replySortOrder' INTEGER, PRIMARY KEY('deviceUnitId', 'replyText', 'replyType'))");
        }
    }

    public static class b extends kd.a {
        public b() {
            super(2, 3);
        }

        @Override // kd.a
        public final void migrate(vd.c cVar) {
            cVar.k3("CREATE TABLE canned_text_reply_temp (`deviceUnitId` INTEGER NOT NULL, `replyText` TEXT NOT NULL, `replyType` INTEGER NOT NULL, `isOnDevice` INTEGER NOT NULL, `replySortOrder` INTEGER NOT NULL, PRIMARY KEY(`deviceUnitId`, `replyText`, `replyType`))");
            cVar.k3("INSERT INTO canned_text_reply_temp (deviceUnitId, replyText, replyType, isOnDevice, replySortOrder) SELECT deviceUnitId, replyText, replyType, isOnDevice, replySortOrder FROM canned_text_reply");
            cVar.k3("DROP TABLE canned_text_reply");
            cVar.k3("ALTER TABLE canned_text_reply_temp RENAME TO canned_text_reply");
            cVar.k3("CREATE TABLE device_supported_capabilities_temp (`unit_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `is_supported` INTEGER NOT NULL, PRIMARY KEY(`unit_id`, `name`))");
            cVar.k3("INSERT INTO device_supported_capabilities_temp (unit_id, name, is_supported) SELECT unit_id, name, is_supported FROM device_supported_capabilities");
            cVar.k3("DROP TABLE device_supported_capabilities");
            cVar.k3("ALTER TABLE device_supported_capabilities_temp RENAME TO device_supported_capabilities");
        }
    }

    public static class c extends kd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f50137a;

        public c(Context context) {
            super(3, 5);
            this.f50137a = context;
        }

        public static HashMap a(SQLiteDatabase sQLiteDatabase) {
            HashMap map = new HashMap();
            Cursor cursorQuery = sQLiteDatabase.query("devices", new String[]{"unit_id", "mac_address"}, null, null, null, null, null);
            try {
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j8 = cursorQuery.getLong(0);
                        String string = cursorQuery.getString(1);
                        if (!TextUtils.isEmpty(string)) {
                            Set hashSet = (Set) map.get(Long.valueOf(j8));
                            if (hashSet == null) {
                                hashSet = new HashSet();
                                map.put(Long.valueOf(j8), hashSet);
                            }
                            hashSet.add(string);
                        }
                    } while (cursorQuery.moveToNext());
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th3) {
                if (cursorQuery == null) {
                    throw th3;
                }
                try {
                    cursorQuery.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }

        public static HashMap b(SQLiteDatabase sQLiteDatabase) {
            HashMap map = new HashMap();
            try {
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM device_capabilities", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        int columnIndex = cursorRawQuery.getColumnIndex("unit_id");
                        int columnIndex2 = cursorRawQuery.getColumnIndex("capability_group");
                        int columnIndex3 = cursorRawQuery.getColumnIndex("capability_mask");
                        do {
                            long j8 = cursorRawQuery.getLong(columnIndex);
                            String string = cursorRawQuery.getString(columnIndex2);
                            long j14 = cursorRawQuery.getLong(columnIndex3);
                            long[] jArr = (long[]) map.get(Long.valueOf(j8));
                            if (jArr == null) {
                                jArr = new long[3];
                                map.put(Long.valueOf(j8), jArr);
                            }
                            if ("CONNECTIVITY".equalsIgnoreCase(string)) {
                                jArr[0] = j14;
                            } else if ("SPORTS".equalsIgnoreCase(string)) {
                                jArr[1] = j14;
                            } else if ("AUDIO_PROMPTS".equalsIgnoreCase(string)) {
                                jArr[2] = j14;
                            }
                        } while (cursorRawQuery.moveToNext());
                    }
                    cursorRawQuery.close();
                    return map;
                } catch (Throwable th3) {
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (SQLiteException e4) {
                ConnectDatabase.f50135a.error("Failed to load legacy capabilities", (Throwable) e4);
                return map;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:12:0x009c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v162 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v5, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r35v0 */
        /* JADX WARN: Type inference failed for: r35v1 */
        /* JADX WARN: Type inference failed for: r35v10 */
        /* JADX WARN: Type inference failed for: r35v100 */
        /* JADX WARN: Type inference failed for: r35v101 */
        /* JADX WARN: Type inference failed for: r35v102 */
        /* JADX WARN: Type inference failed for: r35v103 */
        /* JADX WARN: Type inference failed for: r35v104 */
        /* JADX WARN: Type inference failed for: r35v105 */
        /* JADX WARN: Type inference failed for: r35v106 */
        /* JADX WARN: Type inference failed for: r35v107 */
        /* JADX WARN: Type inference failed for: r35v108 */
        /* JADX WARN: Type inference failed for: r35v109 */
        /* JADX WARN: Type inference failed for: r35v11 */
        /* JADX WARN: Type inference failed for: r35v110 */
        /* JADX WARN: Type inference failed for: r35v111 */
        /* JADX WARN: Type inference failed for: r35v112 */
        /* JADX WARN: Type inference failed for: r35v113 */
        /* JADX WARN: Type inference failed for: r35v114 */
        /* JADX WARN: Type inference failed for: r35v115 */
        /* JADX WARN: Type inference failed for: r35v116 */
        /* JADX WARN: Type inference failed for: r35v117 */
        /* JADX WARN: Type inference failed for: r35v118 */
        /* JADX WARN: Type inference failed for: r35v119 */
        /* JADX WARN: Type inference failed for: r35v12 */
        /* JADX WARN: Type inference failed for: r35v120 */
        /* JADX WARN: Type inference failed for: r35v121 */
        /* JADX WARN: Type inference failed for: r35v122 */
        /* JADX WARN: Type inference failed for: r35v123 */
        /* JADX WARN: Type inference failed for: r35v124 */
        /* JADX WARN: Type inference failed for: r35v125 */
        /* JADX WARN: Type inference failed for: r35v126 */
        /* JADX WARN: Type inference failed for: r35v127 */
        /* JADX WARN: Type inference failed for: r35v128 */
        /* JADX WARN: Type inference failed for: r35v129 */
        /* JADX WARN: Type inference failed for: r35v13 */
        /* JADX WARN: Type inference failed for: r35v130 */
        /* JADX WARN: Type inference failed for: r35v131 */
        /* JADX WARN: Type inference failed for: r35v132 */
        /* JADX WARN: Type inference failed for: r35v133 */
        /* JADX WARN: Type inference failed for: r35v134 */
        /* JADX WARN: Type inference failed for: r35v135 */
        /* JADX WARN: Type inference failed for: r35v136 */
        /* JADX WARN: Type inference failed for: r35v137 */
        /* JADX WARN: Type inference failed for: r35v138 */
        /* JADX WARN: Type inference failed for: r35v139 */
        /* JADX WARN: Type inference failed for: r35v14 */
        /* JADX WARN: Type inference failed for: r35v140 */
        /* JADX WARN: Type inference failed for: r35v141 */
        /* JADX WARN: Type inference failed for: r35v142 */
        /* JADX WARN: Type inference failed for: r35v143 */
        /* JADX WARN: Type inference failed for: r35v144 */
        /* JADX WARN: Type inference failed for: r35v145 */
        /* JADX WARN: Type inference failed for: r35v146 */
        /* JADX WARN: Type inference failed for: r35v147 */
        /* JADX WARN: Type inference failed for: r35v148 */
        /* JADX WARN: Type inference failed for: r35v149 */
        /* JADX WARN: Type inference failed for: r35v15 */
        /* JADX WARN: Type inference failed for: r35v150 */
        /* JADX WARN: Type inference failed for: r35v151 */
        /* JADX WARN: Type inference failed for: r35v152 */
        /* JADX WARN: Type inference failed for: r35v153 */
        /* JADX WARN: Type inference failed for: r35v154 */
        /* JADX WARN: Type inference failed for: r35v155 */
        /* JADX WARN: Type inference failed for: r35v156 */
        /* JADX WARN: Type inference failed for: r35v157 */
        /* JADX WARN: Type inference failed for: r35v158 */
        /* JADX WARN: Type inference failed for: r35v159 */
        /* JADX WARN: Type inference failed for: r35v16 */
        /* JADX WARN: Type inference failed for: r35v160 */
        /* JADX WARN: Type inference failed for: r35v161 */
        /* JADX WARN: Type inference failed for: r35v162 */
        /* JADX WARN: Type inference failed for: r35v163 */
        /* JADX WARN: Type inference failed for: r35v164 */
        /* JADX WARN: Type inference failed for: r35v165 */
        /* JADX WARN: Type inference failed for: r35v166 */
        /* JADX WARN: Type inference failed for: r35v167 */
        /* JADX WARN: Type inference failed for: r35v168 */
        /* JADX WARN: Type inference failed for: r35v169 */
        /* JADX WARN: Type inference failed for: r35v17 */
        /* JADX WARN: Type inference failed for: r35v170 */
        /* JADX WARN: Type inference failed for: r35v171 */
        /* JADX WARN: Type inference failed for: r35v172 */
        /* JADX WARN: Type inference failed for: r35v173 */
        /* JADX WARN: Type inference failed for: r35v174 */
        /* JADX WARN: Type inference failed for: r35v175 */
        /* JADX WARN: Type inference failed for: r35v176 */
        /* JADX WARN: Type inference failed for: r35v177 */
        /* JADX WARN: Type inference failed for: r35v178 */
        /* JADX WARN: Type inference failed for: r35v179 */
        /* JADX WARN: Type inference failed for: r35v18 */
        /* JADX WARN: Type inference failed for: r35v180 */
        /* JADX WARN: Type inference failed for: r35v181 */
        /* JADX WARN: Type inference failed for: r35v182 */
        /* JADX WARN: Type inference failed for: r35v183 */
        /* JADX WARN: Type inference failed for: r35v184 */
        /* JADX WARN: Type inference failed for: r35v185 */
        /* JADX WARN: Type inference failed for: r35v19 */
        /* JADX WARN: Type inference failed for: r35v2 */
        /* JADX WARN: Type inference failed for: r35v20 */
        /* JADX WARN: Type inference failed for: r35v21 */
        /* JADX WARN: Type inference failed for: r35v22 */
        /* JADX WARN: Type inference failed for: r35v23 */
        /* JADX WARN: Type inference failed for: r35v24 */
        /* JADX WARN: Type inference failed for: r35v25 */
        /* JADX WARN: Type inference failed for: r35v26 */
        /* JADX WARN: Type inference failed for: r35v27 */
        /* JADX WARN: Type inference failed for: r35v28 */
        /* JADX WARN: Type inference failed for: r35v29 */
        /* JADX WARN: Type inference failed for: r35v3, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r35v30 */
        /* JADX WARN: Type inference failed for: r35v31 */
        /* JADX WARN: Type inference failed for: r35v32 */
        /* JADX WARN: Type inference failed for: r35v33 */
        /* JADX WARN: Type inference failed for: r35v34 */
        /* JADX WARN: Type inference failed for: r35v35 */
        /* JADX WARN: Type inference failed for: r35v36 */
        /* JADX WARN: Type inference failed for: r35v37 */
        /* JADX WARN: Type inference failed for: r35v38 */
        /* JADX WARN: Type inference failed for: r35v39 */
        /* JADX WARN: Type inference failed for: r35v4 */
        /* JADX WARN: Type inference failed for: r35v40 */
        /* JADX WARN: Type inference failed for: r35v41 */
        /* JADX WARN: Type inference failed for: r35v42 */
        /* JADX WARN: Type inference failed for: r35v43 */
        /* JADX WARN: Type inference failed for: r35v44 */
        /* JADX WARN: Type inference failed for: r35v45 */
        /* JADX WARN: Type inference failed for: r35v46 */
        /* JADX WARN: Type inference failed for: r35v47 */
        /* JADX WARN: Type inference failed for: r35v48 */
        /* JADX WARN: Type inference failed for: r35v49 */
        /* JADX WARN: Type inference failed for: r35v5, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r35v50 */
        /* JADX WARN: Type inference failed for: r35v51 */
        /* JADX WARN: Type inference failed for: r35v52 */
        /* JADX WARN: Type inference failed for: r35v53 */
        /* JADX WARN: Type inference failed for: r35v54 */
        /* JADX WARN: Type inference failed for: r35v55 */
        /* JADX WARN: Type inference failed for: r35v56 */
        /* JADX WARN: Type inference failed for: r35v57 */
        /* JADX WARN: Type inference failed for: r35v58 */
        /* JADX WARN: Type inference failed for: r35v59 */
        /* JADX WARN: Type inference failed for: r35v6 */
        /* JADX WARN: Type inference failed for: r35v60 */
        /* JADX WARN: Type inference failed for: r35v61 */
        /* JADX WARN: Type inference failed for: r35v62 */
        /* JADX WARN: Type inference failed for: r35v63 */
        /* JADX WARN: Type inference failed for: r35v64 */
        /* JADX WARN: Type inference failed for: r35v65 */
        /* JADX WARN: Type inference failed for: r35v66 */
        /* JADX WARN: Type inference failed for: r35v67 */
        /* JADX WARN: Type inference failed for: r35v68 */
        /* JADX WARN: Type inference failed for: r35v69 */
        /* JADX WARN: Type inference failed for: r35v7 */
        /* JADX WARN: Type inference failed for: r35v70 */
        /* JADX WARN: Type inference failed for: r35v71 */
        /* JADX WARN: Type inference failed for: r35v76 */
        /* JADX WARN: Type inference failed for: r35v77 */
        /* JADX WARN: Type inference failed for: r35v78 */
        /* JADX WARN: Type inference failed for: r35v79 */
        /* JADX WARN: Type inference failed for: r35v8, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r35v80 */
        /* JADX WARN: Type inference failed for: r35v81 */
        /* JADX WARN: Type inference failed for: r35v82 */
        /* JADX WARN: Type inference failed for: r35v83 */
        /* JADX WARN: Type inference failed for: r35v84 */
        /* JADX WARN: Type inference failed for: r35v85 */
        /* JADX WARN: Type inference failed for: r35v86 */
        /* JADX WARN: Type inference failed for: r35v87 */
        /* JADX WARN: Type inference failed for: r35v88 */
        /* JADX WARN: Type inference failed for: r35v89 */
        /* JADX WARN: Type inference failed for: r35v9 */
        /* JADX WARN: Type inference failed for: r35v90 */
        /* JADX WARN: Type inference failed for: r35v91 */
        /* JADX WARN: Type inference failed for: r35v92 */
        /* JADX WARN: Type inference failed for: r35v93 */
        /* JADX WARN: Type inference failed for: r35v94 */
        /* JADX WARN: Type inference failed for: r35v95 */
        /* JADX WARN: Type inference failed for: r35v96 */
        /* JADX WARN: Type inference failed for: r35v97 */
        /* JADX WARN: Type inference failed for: r35v98 */
        /* JADX WARN: Type inference failed for: r35v99 */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v133 */
        /* JADX WARN: Type inference failed for: r7v134 */
        /* JADX WARN: Type inference failed for: r7v135 */
        /* JADX WARN: Type inference failed for: r7v137 */
        /* JADX WARN: Type inference failed for: r7v138 */
        /* JADX WARN: Type inference failed for: r7v139 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v140 */
        /* JADX WARN: Type inference failed for: r7v141 */
        /* JADX WARN: Type inference failed for: r7v142 */
        /* JADX WARN: Type inference failed for: r7v143 */
        /* JADX WARN: Type inference failed for: r7v144 */
        /* JADX WARN: Type inference failed for: r7v145 */
        /* JADX WARN: Type inference failed for: r7v146 */
        /* JADX WARN: Type inference failed for: r7v147 */
        /* JADX WARN: Type inference failed for: r7v148 */
        /* JADX WARN: Type inference failed for: r7v149 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v150 */
        /* JADX WARN: Type inference failed for: r7v151 */
        /* JADX WARN: Type inference failed for: r7v152 */
        /* JADX WARN: Type inference failed for: r7v153 */
        /* JADX WARN: Type inference failed for: r7v154 */
        /* JADX WARN: Type inference failed for: r7v155 */
        /* JADX WARN: Type inference failed for: r7v156 */
        /* JADX WARN: Type inference failed for: r7v157 */
        /* JADX WARN: Type inference failed for: r7v158 */
        /* JADX WARN: Type inference failed for: r7v159 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v160 */
        /* JADX WARN: Type inference failed for: r7v161 */
        /* JADX WARN: Type inference failed for: r7v162 */
        /* JADX WARN: Type inference failed for: r7v163 */
        /* JADX WARN: Type inference failed for: r7v164 */
        /* JADX WARN: Type inference failed for: r7v165 */
        /* JADX WARN: Type inference failed for: r7v166 */
        /* JADX WARN: Type inference failed for: r7v167 */
        /* JADX WARN: Type inference failed for: r7v168 */
        /* JADX WARN: Type inference failed for: r7v169 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v170 */
        /* JADX WARN: Type inference failed for: r7v171 */
        /* JADX WARN: Type inference failed for: r7v172 */
        /* JADX WARN: Type inference failed for: r7v173 */
        /* JADX WARN: Type inference failed for: r7v174 */
        /* JADX WARN: Type inference failed for: r7v175 */
        /* JADX WARN: Type inference failed for: r7v176 */
        /* JADX WARN: Type inference failed for: r7v177 */
        /* JADX WARN: Type inference failed for: r7v178 */
        /* JADX WARN: Type inference failed for: r7v179 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v180 */
        /* JADX WARN: Type inference failed for: r7v181 */
        /* JADX WARN: Type inference failed for: r7v182 */
        /* JADX WARN: Type inference failed for: r7v183 */
        /* JADX WARN: Type inference failed for: r7v184 */
        /* JADX WARN: Type inference failed for: r7v185 */
        /* JADX WARN: Type inference failed for: r7v186 */
        /* JADX WARN: Type inference failed for: r7v187 */
        /* JADX WARN: Type inference failed for: r7v188 */
        /* JADX WARN: Type inference failed for: r7v189 */
        /* JADX WARN: Type inference failed for: r7v19 */
        /* JADX WARN: Type inference failed for: r7v190 */
        /* JADX WARN: Type inference failed for: r7v191 */
        /* JADX WARN: Type inference failed for: r7v192 */
        /* JADX WARN: Type inference failed for: r7v193 */
        /* JADX WARN: Type inference failed for: r7v194 */
        /* JADX WARN: Type inference failed for: r7v195 */
        /* JADX WARN: Type inference failed for: r7v196 */
        /* JADX WARN: Type inference failed for: r7v197 */
        /* JADX WARN: Type inference failed for: r7v198 */
        /* JADX WARN: Type inference failed for: r7v199 */
        /* JADX WARN: Type inference failed for: r7v20 */
        /* JADX WARN: Type inference failed for: r7v200 */
        /* JADX WARN: Type inference failed for: r7v201 */
        /* JADX WARN: Type inference failed for: r7v202 */
        /* JADX WARN: Type inference failed for: r7v203 */
        /* JADX WARN: Type inference failed for: r7v204 */
        /* JADX WARN: Type inference failed for: r7v205 */
        /* JADX WARN: Type inference failed for: r7v206 */
        /* JADX WARN: Type inference failed for: r7v207 */
        /* JADX WARN: Type inference failed for: r7v208 */
        /* JADX WARN: Type inference failed for: r7v209 */
        /* JADX WARN: Type inference failed for: r7v21 */
        /* JADX WARN: Type inference failed for: r7v210 */
        /* JADX WARN: Type inference failed for: r7v211 */
        /* JADX WARN: Type inference failed for: r7v212 */
        /* JADX WARN: Type inference failed for: r7v213 */
        /* JADX WARN: Type inference failed for: r7v214 */
        /* JADX WARN: Type inference failed for: r7v215 */
        /* JADX WARN: Type inference failed for: r7v216 */
        /* JADX WARN: Type inference failed for: r7v217 */
        /* JADX WARN: Type inference failed for: r7v218 */
        /* JADX WARN: Type inference failed for: r7v219 */
        /* JADX WARN: Type inference failed for: r7v22 */
        /* JADX WARN: Type inference failed for: r7v220 */
        /* JADX WARN: Type inference failed for: r7v221 */
        /* JADX WARN: Type inference failed for: r7v222 */
        /* JADX WARN: Type inference failed for: r7v223 */
        /* JADX WARN: Type inference failed for: r7v224 */
        /* JADX WARN: Type inference failed for: r7v225 */
        /* JADX WARN: Type inference failed for: r7v226 */
        /* JADX WARN: Type inference failed for: r7v227 */
        /* JADX WARN: Type inference failed for: r7v228 */
        /* JADX WARN: Type inference failed for: r7v229 */
        /* JADX WARN: Type inference failed for: r7v23 */
        /* JADX WARN: Type inference failed for: r7v230 */
        /* JADX WARN: Type inference failed for: r7v231 */
        /* JADX WARN: Type inference failed for: r7v232 */
        /* JADX WARN: Type inference failed for: r7v233 */
        /* JADX WARN: Type inference failed for: r7v234 */
        /* JADX WARN: Type inference failed for: r7v235 */
        /* JADX WARN: Type inference failed for: r7v236 */
        /* JADX WARN: Type inference failed for: r7v237 */
        /* JADX WARN: Type inference failed for: r7v238 */
        /* JADX WARN: Type inference failed for: r7v239 */
        /* JADX WARN: Type inference failed for: r7v24 */
        /* JADX WARN: Type inference failed for: r7v240 */
        /* JADX WARN: Type inference failed for: r7v241 */
        /* JADX WARN: Type inference failed for: r7v242 */
        /* JADX WARN: Type inference failed for: r7v243 */
        /* JADX WARN: Type inference failed for: r7v244 */
        /* JADX WARN: Type inference failed for: r7v245 */
        /* JADX WARN: Type inference failed for: r7v246 */
        /* JADX WARN: Type inference failed for: r7v247 */
        /* JADX WARN: Type inference failed for: r7v25 */
        /* JADX WARN: Type inference failed for: r7v26 */
        /* JADX WARN: Type inference failed for: r7v27 */
        /* JADX WARN: Type inference failed for: r7v28 */
        /* JADX WARN: Type inference failed for: r7v29 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v30 */
        /* JADX WARN: Type inference failed for: r7v31 */
        /* JADX WARN: Type inference failed for: r7v32 */
        /* JADX WARN: Type inference failed for: r7v33 */
        /* JADX WARN: Type inference failed for: r7v34 */
        /* JADX WARN: Type inference failed for: r7v35 */
        /* JADX WARN: Type inference failed for: r7v36 */
        /* JADX WARN: Type inference failed for: r7v37 */
        /* JADX WARN: Type inference failed for: r7v38 */
        /* JADX WARN: Type inference failed for: r7v39 */
        /* JADX WARN: Type inference failed for: r7v40 */
        /* JADX WARN: Type inference failed for: r7v41 */
        /* JADX WARN: Type inference failed for: r7v42 */
        /* JADX WARN: Type inference failed for: r7v43 */
        /* JADX WARN: Type inference failed for: r7v44 */
        /* JADX WARN: Type inference failed for: r7v45 */
        /* JADX WARN: Type inference failed for: r7v46 */
        /* JADX WARN: Type inference failed for: r7v47 */
        /* JADX WARN: Type inference failed for: r7v48 */
        /* JADX WARN: Type inference failed for: r7v49 */
        /* JADX WARN: Type inference failed for: r7v50 */
        /* JADX WARN: Type inference failed for: r7v51 */
        /* JADX WARN: Type inference failed for: r7v52 */
        /* JADX WARN: Type inference failed for: r7v53 */
        /* JADX WARN: Type inference failed for: r7v54 */
        /* JADX WARN: Type inference failed for: r7v55 */
        /* JADX WARN: Type inference failed for: r7v56 */
        /* JADX WARN: Type inference failed for: r7v57 */
        /* JADX WARN: Type inference failed for: r7v58 */
        /* JADX WARN: Type inference failed for: r7v59 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v60 */
        /* JADX WARN: Type inference failed for: r7v61 */
        /* JADX WARN: Type inference failed for: r7v62 */
        /* JADX WARN: Type inference failed for: r7v63, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.lang.String] */
        @Override // kd.a
        public final void migrate(vd.c cVar) throws Throwable {
            ?? r35;
            ?? r36;
            ?? r14;
            byte b14;
            byte b15;
            ?? r37;
            ?? r15;
            ?? r38;
            ?? r16;
            byte b16;
            ?? r39;
            ?? r17;
            int i14;
            ?? r18;
            String str;
            int i15 = 1;
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(this.f50137a.getDatabasePath("gcm_cache.db").getAbsolutePath(), null, 1);
            try {
                HashMap mapA = a(sQLiteDatabaseOpenDatabase);
                HashMap mapB = b(sQLiteDatabaseOpenDatabase);
                sQLiteDatabaseOpenDatabase.close();
                cVar.k3("CREATE TABLE IF NOT EXISTS device_capabilities (`unit_id` INTEGER NOT NULL, `mac_address` TEXT NOT NULL, `capabilities` BLOB NOT NULL, PRIMARY KEY(`unit_id`, `mac_address`))");
                HashMap map = new HashMap();
                Iterator it = mapB.entrySet().iterator();
                while (true) {
                    String str2 = "CONNECTIQ_WIDGET_DOWNLOAD";
                    String str3 = "SWING_SENSOR_REMOTE";
                    int i16 = i15;
                    String str4 = "FIND_MY_WATCH";
                    Iterator it3 = it;
                    String str5 = "LIVETRACK_MESSAGING";
                    HashMap map2 = mapB;
                    String str6 = "INSTANT_INPUT";
                    HashMap map3 = mapA;
                    String str7 = "STOP_SYNC_AFTER_SOFTWARE_UPDATE";
                    int i17 = 2;
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        long[] jArr = (long[]) entry.getValue();
                        Long l14 = (Long) entry.getKey();
                        long j8 = jArr[0];
                        long j14 = jArr[i16];
                        long j15 = jArr[2];
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("STOP_SYNC_AFTER_SOFTWARE_UPDATE");
                        HashMap map4 = map;
                        int i18 = 0;
                        while (true) {
                            String str8 = str7;
                            if (i18 <= 31) {
                                String str9 = str4;
                                if (((int) ((j8 >> i18) & 1)) != 0) {
                                    switch (i18) {
                                        case 4:
                                            str9 = str9;
                                            str = str8;
                                            arrayList.add("COURSE_DOWNLOAD");
                                            break;
                                        case 5:
                                            str9 = str9;
                                            str = str8;
                                            arrayList.add("WORKOUT_DOWNLOAD");
                                            break;
                                        case 6:
                                            str9 = str9;
                                            str = str8;
                                            arrayList.add("LIVETRACK");
                                            break;
                                        case 7:
                                            str9 = str9;
                                            str = str8;
                                            arrayList.add("WEATHER_CONDITIONS");
                                            break;
                                        case 8:
                                            str9 = str9;
                                            str = str8;
                                            arrayList.add("WEATHER_ALERTS");
                                            break;
                                        case 9:
                                            str9 = str9;
                                            str = str8;
                                            arrayList.add("GPS_EPHEMERIS_DOWNLOAD");
                                            break;
                                        case 10:
                                            str9 = str9;
                                            str = str8;
                                            arrayList.add("EXPLICIT_ARCHIVE");
                                            break;
                                        case 11:
                                        case 13:
                                        case 24:
                                        case 25:
                                        default:
                                            str = str8;
                                            break;
                                        case 12:
                                            str = str8;
                                            arrayList.remove(str);
                                            break;
                                        case 14:
                                            str9 = str9;
                                            arrayList.add("GOLF_COURSE_DOWNLOAD");
                                            str = str8;
                                            break;
                                        case 15:
                                            str9 = str9;
                                            arrayList.add("DEVICE_INITIATES_SYNC");
                                            str = str8;
                                            break;
                                        case 16:
                                            str9 = str9;
                                            arrayList.add("CONNECTIQ_WATCH_APP_DOWNLOAD");
                                            str = str8;
                                            break;
                                        case 17:
                                            str9 = str9;
                                            arrayList.add("CONNECTIQ_WIDGET_DOWNLOAD");
                                            str = str8;
                                            break;
                                        case 18:
                                            str9 = str9;
                                            arrayList.add("CONNECTIQ_WATCH_FACE_DOWNLOAD");
                                            str = str8;
                                            break;
                                        case 19:
                                            str9 = str9;
                                            arrayList.add("CONNECTIQ_DATA_FIELD_DOWNLOAD");
                                            str = str8;
                                            break;
                                        case 20:
                                            str9 = str9;
                                            arrayList.add("CONNECTIQ_APP_MANAGEMENT");
                                            str = str8;
                                            break;
                                        case 21:
                                            str9 = str9;
                                            arrayList.add("SWING_SENSOR");
                                            str = str8;
                                            break;
                                        case 22:
                                            str9 = str9;
                                            arrayList.add("SWING_SENSOR_REMOTE");
                                            str = str8;
                                            break;
                                        case 23:
                                            str9 = str9;
                                            arrayList.add("INCIDENT_DETECTION");
                                            str = str8;
                                            break;
                                        case 26:
                                            str9 = str9;
                                            arrayList.add("TRUEUP");
                                            str = str8;
                                            break;
                                        case 27:
                                            str9 = str9;
                                            arrayList.add(str9);
                                            str = str8;
                                            break;
                                        case 28:
                                            arrayList.add("HOST_INITIATED_SYNC_REQUESTS");
                                            str = str8;
                                            break;
                                        case 29:
                                            arrayList.add("LIVETRACK_AUTO_START");
                                            str = str8;
                                            break;
                                        case 30:
                                            arrayList.add("LIVETRACK_MESSAGING");
                                            str = str8;
                                            break;
                                        case 31:
                                            arrayList.add("INSTANT_INPUT");
                                            str = str8;
                                            break;
                                    }
                                } else {
                                    str = str8;
                                }
                                i18++;
                                String str10 = str;
                                str4 = str9;
                                str7 = str10;
                            } else {
                                int i19 = 0;
                                while (i19 <= 5) {
                                    if (((int) ((j14 >> i19) & 1)) != 0) {
                                        if (i19 == 0) {
                                            arrayList.add("SPORT_GENERIC");
                                        } else if (i19 == i16) {
                                            arrayList.add("SPORT_RUNNING");
                                        } else if (i19 == i17) {
                                            arrayList.add("SPORT_CYCLING");
                                        } else if (i19 == 3) {
                                            arrayList.add("SPORT_TRANSITION");
                                        } else if (i19 == 4) {
                                            arrayList.add("SPORT_FITNESS_EQUIPMENT");
                                        } else if (i19 == 5) {
                                            arrayList.add("SPORT_SWIMMING");
                                        }
                                    }
                                    i19++;
                                    i16 = 1;
                                    i17 = 2;
                                }
                                for (int i24 = 0; i24 <= 5; i24++) {
                                    if (((int) ((j15 >> i24) & 1)) != 0) {
                                        if (i24 == 0) {
                                            arrayList.add("AUDIO_PROMPT_LAP");
                                        } else if (i24 == 1) {
                                            arrayList.add("AUDIO_PROMPT_PACE_SPEED");
                                        } else if (i24 == 2) {
                                            arrayList.add("AUDIO_PROMPT_HEART_RATE");
                                        } else if (i24 == 3) {
                                            arrayList.add("AUDIO_PROMPT_POWER");
                                        } else if (i24 == 4) {
                                            arrayList.add("AUDIO_PROMPT_NAVIGATION");
                                        } else if (i24 == 5) {
                                            arrayList.add("AUDIO_PROMPT_CADENCE");
                                        }
                                    }
                                }
                                map4.put(l14, arrayList);
                                map = map4;
                                it = it3;
                                mapB = map2;
                                mapA = map3;
                                i15 = 1;
                            }
                        }
                    } else {
                        Object obj = "STOP_SYNC_AFTER_SOFTWARE_UPDATE";
                        HashMap map5 = map;
                        HashMap map6 = new HashMap();
                        Object obj2 = "LIVETRACK_AUTO_START";
                        Object obj3 = "TRUEUP";
                        Cursor cursorX3 = cVar.X3("SELECT * FROM device_supported_capabilities");
                        try {
                            Object obj4 = "INCIDENT_DETECTION";
                            Object obj5 = "SWING_SENSOR";
                            Object obj6 = "FIND_MY_WATCH";
                            if (cursorX3.moveToFirst()) {
                                int columnIndex = cursorX3.getColumnIndex("unit_id");
                                int columnIndex2 = cursorX3.getColumnIndex("name");
                                int columnIndex3 = cursorX3.getColumnIndex("is_supported");
                                while (true) {
                                    long j16 = cursorX3.getLong(columnIndex);
                                    int i25 = columnIndex;
                                    List arrayList2 = (List) map6.get(Long.valueOf(j16));
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                        map6.put(Long.valueOf(j16), arrayList2);
                                    }
                                    if (cursorX3.getInt(columnIndex3) != 0) {
                                        arrayList2.add(cursorX3.getString(columnIndex2));
                                    }
                                    if (cursorX3.moveToNext()) {
                                        columnIndex = i25;
                                        str3 = str3;
                                    }
                                }
                            } else {
                                str3 = "SWING_SENSOR_REMOTE";
                            }
                            cursorX3.close();
                            map5.putAll(map6);
                            HashMap map7 = new HashMap();
                            ?? X3 = cVar.X3("SELECT * FROM device_supported_capabilities");
                            try {
                                if (X3.moveToFirst()) {
                                    int columnIndex4 = X3.getColumnIndex("unit_id");
                                    int columnIndex5 = X3.getColumnIndex("name");
                                    int columnIndex6 = X3.getColumnIndex("is_supported");
                                    X3 = X3;
                                    ?? r310 = str3;
                                    while (true) {
                                        long j17 = X3.getLong(columnIndex4);
                                        HashMap map8 = map3;
                                        Set set = (Set) map8.get(Long.valueOf(j17));
                                        if (set != null && !set.isEmpty()) {
                                            Iterator it4 = set.iterator();
                                            while (it4.hasNext()) {
                                                int i26 = columnIndex4;
                                                Pair pairCreate = Pair.create(Long.valueOf(j17), (String) it4.next());
                                                byte[] bArrCopyOf = (byte[]) map7.get(pairCreate);
                                                long j18 = j17;
                                                if (bArrCopyOf == null) {
                                                    bArrCopyOf = new byte[10];
                                                }
                                                if (X3.getInt(columnIndex6) != 0) {
                                                    ?? string = X3.getString(columnIndex5);
                                                    string.getClass();
                                                    byte b17 = -1;
                                                    switch (string.hashCode()) {
                                                        case -2109615368:
                                                            ?? r19 = r310;
                                                            ?? r311 = X3;
                                                            r17 = r19;
                                                            r39 = r311;
                                                            if (string.equals("UNION_PAY")) {
                                                                b17 = 0;
                                                                r17 = r19;
                                                                r39 = r311;
                                                            }
                                                            break;
                                                        case -2104292461:
                                                            ?? r24 = r310;
                                                            ?? r312 = X3;
                                                            r17 = r24;
                                                            r39 = r312;
                                                            if (string.equals("CURRENT_TIME_REQUEST_SUPPORT")) {
                                                                b17 = 1;
                                                                r17 = r24;
                                                                r39 = r312;
                                                            }
                                                            break;
                                                        case -2023914452:
                                                            ?? r25 = r310;
                                                            ?? r313 = X3;
                                                            r17 = r25;
                                                            r39 = r313;
                                                            if (string.equals("COURSE_DOWNLOAD")) {
                                                                b17 = 2;
                                                                r17 = r25;
                                                                r39 = r313;
                                                            }
                                                            break;
                                                        case -2022959127:
                                                            ?? r26 = r310;
                                                            ?? r314 = X3;
                                                            r17 = r26;
                                                            r39 = r314;
                                                            if (string.equals("DEVICE_INITIATES_SYNC")) {
                                                                b17 = 3;
                                                                r17 = r26;
                                                                r39 = r314;
                                                            }
                                                            break;
                                                        case -1891394992:
                                                            ?? r27 = r310;
                                                            ?? r315 = X3;
                                                            r17 = r27;
                                                            r39 = r315;
                                                            if (string.equals("CONNECTIQ_SETTINGS")) {
                                                                b17 = 4;
                                                                r17 = r27;
                                                                r39 = r315;
                                                            }
                                                            break;
                                                        case -1823438115:
                                                            ?? r28 = r310;
                                                            ?? r316 = X3;
                                                            r17 = r28;
                                                            r39 = r316;
                                                            if (string.equals("HOST_INITIATED_SYNC_REQUESTS")) {
                                                                b17 = 5;
                                                                r17 = r28;
                                                                r39 = r316;
                                                            }
                                                            break;
                                                        case -1811788631:
                                                            ?? r29 = r310;
                                                            ?? r317 = X3;
                                                            Object obj7 = obj3;
                                                            if (string.equals(obj7)) {
                                                                b14 = 6;
                                                                obj3 = obj7;
                                                                r16 = r29;
                                                                r38 = r317;
                                                                b17 = b14;
                                                                r17 = r16;
                                                                r39 = r38;
                                                            } else {
                                                                obj3 = obj7;
                                                                r17 = r29;
                                                                r39 = r317;
                                                            }
                                                            break;
                                                        case -1794055656:
                                                            ?? r34 = r310;
                                                            ?? r318 = X3;
                                                            r17 = r34;
                                                            r39 = r318;
                                                            if (string.equals("SPORT_CYCLING")) {
                                                                b15 = 7;
                                                                r15 = r34;
                                                                r37 = r318;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -1791452622:
                                                            ?? r44 = r310;
                                                            ?? r319 = X3;
                                                            Object obj8 = obj2;
                                                            if (string.equals(obj8)) {
                                                                b14 = 8;
                                                                obj2 = obj8;
                                                                r16 = r44;
                                                                r38 = r319;
                                                                b17 = b14;
                                                                r17 = r16;
                                                                r39 = r38;
                                                            } else {
                                                                obj2 = obj8;
                                                                r17 = r44;
                                                                r39 = r319;
                                                            }
                                                            break;
                                                        case -1765499408:
                                                            ?? r45 = r310;
                                                            ?? r320 = X3;
                                                            r17 = r45;
                                                            r39 = r320;
                                                            if (string.equals("LAUNCH_REMOTE_CIQ_APP_SUPPORT")) {
                                                                b15 = 9;
                                                                r15 = r45;
                                                                r37 = r320;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -1690448595:
                                                            ?? r46 = r310;
                                                            ?? r321 = X3;
                                                            r17 = r46;
                                                            r39 = r321;
                                                            if (string.equals("LTE_SUPPORT")) {
                                                                b17 = 10;
                                                                r17 = r46;
                                                                r39 = r321;
                                                            }
                                                            break;
                                                        case -1680391988:
                                                            ?? r47 = r310;
                                                            ?? r322 = X3;
                                                            r17 = r47;
                                                            r39 = r322;
                                                            if (string.equals("SPORT_STRENGTH")) {
                                                                b15 = Ascii.VT;
                                                                r15 = r47;
                                                                r37 = r322;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -1653168443:
                                                            ?? r48 = r310;
                                                            ?? r323 = X3;
                                                            r17 = r48;
                                                            r39 = r323;
                                                            if (string.equals("GOLF_FIT_LINK")) {
                                                                b15 = Ascii.FF;
                                                                r15 = r48;
                                                                r37 = r323;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -1547719880:
                                                            ?? r49 = r310;
                                                            ?? r324 = X3;
                                                            Object obj9 = obj4;
                                                            if (string.equals(obj9)) {
                                                                b14 = Ascii.CR;
                                                                obj4 = obj9;
                                                                r16 = r49;
                                                                r38 = r324;
                                                                b17 = b14;
                                                                r17 = r16;
                                                                r39 = r38;
                                                            } else {
                                                                obj4 = obj9;
                                                                r17 = r49;
                                                                r39 = r324;
                                                            }
                                                            break;
                                                        case -1470700620:
                                                            ?? r54 = r310;
                                                            ?? r325 = X3;
                                                            r17 = r54;
                                                            r39 = r325;
                                                            if (string.equals("SPORT_RUNNING")) {
                                                                b15 = Ascii.SO;
                                                                r15 = r54;
                                                                r37 = r325;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -1336877076:
                                                            ?? r55 = r310;
                                                            ?? r326 = X3;
                                                            r17 = r55;
                                                            r39 = r326;
                                                            if (string.equals("CUSTOM_CANNED_TEXT_LIST_SUPPORT")) {
                                                                b15 = Ascii.SI;
                                                                r15 = r55;
                                                                r37 = r326;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -1299027555:
                                                            ?? r56 = r310;
                                                            ?? r327 = X3;
                                                            r17 = r56;
                                                            r39 = r327;
                                                            if (string.equals("DEVICE_DRIVEN_LIVETRACK_SUPPORT")) {
                                                                b15 = Ascii.DLE;
                                                                r15 = r56;
                                                                r37 = r327;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -1233221213:
                                                            ?? r57 = r310;
                                                            ?? r328 = X3;
                                                            r17 = r57;
                                                            r39 = r328;
                                                            if (string.equals("REQUEST_PAIR_FLOW")) {
                                                                b15 = 17;
                                                                r15 = r57;
                                                                r37 = r328;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -1169569789:
                                                            ?? r58 = r310;
                                                            ?? r329 = X3;
                                                            r17 = r58;
                                                            r39 = r329;
                                                            if (string.equals("WEATHER_CONDITIONS")) {
                                                                b15 = Ascii.DC2;
                                                                r15 = r58;
                                                                r37 = r329;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -924334033:
                                                            ?? r59 = r310;
                                                            ?? r330 = X3;
                                                            r17 = r59;
                                                            r39 = r330;
                                                            if (string.equals("INCIDENT_DETECT_AND_ASSISTANCE")) {
                                                                b15 = 19;
                                                                r15 = r59;
                                                                r37 = r330;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -845978848:
                                                            ?? r64 = r310;
                                                            ?? r331 = X3;
                                                            r17 = r64;
                                                            r39 = r331;
                                                            if (string.equals("SPORT_TRANSITION")) {
                                                                b15 = Ascii.DC4;
                                                                r15 = r64;
                                                                r37 = r331;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -836956875:
                                                            ?? r65 = r310;
                                                            ?? r332 = X3;
                                                            r17 = r65;
                                                            r39 = r332;
                                                            if (string.equals("CONNECTIQ_HTTP")) {
                                                                b15 = Ascii.NAK;
                                                                r15 = r65;
                                                                r37 = r332;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -786238099:
                                                            ?? r66 = r310;
                                                            ?? r333 = X3;
                                                            r17 = r66;
                                                            r39 = r333;
                                                            if (string.equals("ADVANCED_MUSIC_CONTROLS")) {
                                                                b15 = Ascii.SYN;
                                                                r15 = r66;
                                                                r37 = r333;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -705333139:
                                                            ?? r67 = r310;
                                                            ?? r334 = X3;
                                                            r17 = r67;
                                                            r39 = r334;
                                                            if (string.equals("AUDIO_PROMPT_PACE_SPEED")) {
                                                                b15 = Ascii.ETB;
                                                                r15 = r67;
                                                                r37 = r334;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -524641950:
                                                            ?? r68 = r310;
                                                            ?? r335 = X3;
                                                            r17 = r68;
                                                            r39 = r335;
                                                            if (string.equals("WEATHER_ALERTS")) {
                                                                b15 = Ascii.CAN;
                                                                r15 = r68;
                                                                r37 = r335;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -480050241:
                                                            ?? r69 = r310;
                                                            ?? r336 = X3;
                                                            r17 = r69;
                                                            r39 = r336;
                                                            if (string.equals("LIVETRACK")) {
                                                                b15 = Ascii.EM;
                                                                r15 = r69;
                                                                r37 = r336;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -474778477:
                                                            ?? r73 = r310;
                                                            ?? r337 = X3;
                                                            r17 = r73;
                                                            r39 = r337;
                                                            if (string.equals("LOCATION_UPDATE")) {
                                                                b15 = Ascii.SUB;
                                                                r15 = r73;
                                                                r37 = r337;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -450759796:
                                                            ?? r74 = r310;
                                                            ?? r338 = X3;
                                                            r17 = r74;
                                                            r39 = r338;
                                                            if (string.equals("SPORT_FITNESS_EQUIPMENT")) {
                                                                b15 = Ascii.ESC;
                                                                r15 = r74;
                                                                r37 = r338;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -258791365:
                                                            ?? r75 = r310;
                                                            ?? r339 = X3;
                                                            Object obj10 = obj5;
                                                            if (string.equals(obj10)) {
                                                                b14 = Ascii.FS;
                                                                obj5 = obj10;
                                                                r16 = r75;
                                                                r38 = r339;
                                                                b17 = b14;
                                                                r17 = r16;
                                                                r39 = r38;
                                                            } else {
                                                                obj5 = obj10;
                                                                r17 = r75;
                                                                r39 = r339;
                                                            }
                                                            break;
                                                        case -217650928:
                                                            ?? r76 = r310;
                                                            ?? r340 = X3;
                                                            r17 = r76;
                                                            r39 = r340;
                                                            if (string.equals("CONNECT_MOBILE_FIT_LINK")) {
                                                                b15 = Ascii.GS;
                                                                r15 = r76;
                                                                r37 = r340;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -130521452:
                                                            ?? r77 = r310;
                                                            ?? r341 = X3;
                                                            r17 = r77;
                                                            r39 = r341;
                                                            if (string.equals("CIQ_AUDIO_CONTENT_PROVIDER")) {
                                                                b15 = Ascii.RS;
                                                                r15 = r77;
                                                                r37 = r341;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -119385835:
                                                            ?? r78 = r310;
                                                            ?? r342 = X3;
                                                            r17 = r78;
                                                            r39 = r342;
                                                            if (string.equals("DEVICE_MESSAGES")) {
                                                                b17 = Ascii.US;
                                                                r17 = r78;
                                                                r39 = r342;
                                                            }
                                                            break;
                                                        case -117921726:
                                                            ?? r79 = r310;
                                                            ?? r343 = X3;
                                                            r17 = r79;
                                                            r39 = r343;
                                                            if (string.equals("SMS_NOTIFICATIONS")) {
                                                                b15 = 32;
                                                                r15 = r79;
                                                                r37 = r343;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -109288255:
                                                            ?? r84 = r310;
                                                            ?? r344 = X3;
                                                            r17 = r84;
                                                            r39 = r344;
                                                            if (string.equals("FIND_MY_PHONE")) {
                                                                b15 = 33;
                                                                r15 = r84;
                                                                r37 = r344;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -103027678:
                                                            ?? r85 = r310;
                                                            ?? r345 = X3;
                                                            Object obj11 = obj6;
                                                            if (string.equals(obj11)) {
                                                                b14 = 34;
                                                                obj6 = obj11;
                                                                r16 = r85;
                                                                r38 = r345;
                                                                b17 = b14;
                                                                r17 = r16;
                                                                r39 = r38;
                                                            } else {
                                                                obj6 = obj11;
                                                                r17 = r85;
                                                                r39 = r345;
                                                            }
                                                            break;
                                                        case -26696653:
                                                            ?? r86 = r310;
                                                            ?? r346 = X3;
                                                            r17 = r86;
                                                            r39 = r346;
                                                            if (string.equals("AUDIO_PROMPT_POWER")) {
                                                                b15 = 35;
                                                                r15 = r86;
                                                                r37 = r346;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case -4743850:
                                                            ?? r87 = r310;
                                                            ?? r347 = X3;
                                                            String str11 = str2;
                                                            if (string.equals(str11)) {
                                                                b14 = 36;
                                                                str2 = str11;
                                                                r16 = r87;
                                                                r38 = r347;
                                                                b17 = b14;
                                                                r17 = r16;
                                                                r39 = r38;
                                                            } else {
                                                                str2 = str11;
                                                                r17 = r87;
                                                                r39 = r347;
                                                            }
                                                            break;
                                                        case -2039196:
                                                            ?? r88 = r310;
                                                            ?? r348 = X3;
                                                            String str12 = str5;
                                                            if (string.equals(str12)) {
                                                                b14 = 37;
                                                                str5 = str12;
                                                                r16 = r88;
                                                                r38 = r348;
                                                                b17 = b14;
                                                                r17 = r16;
                                                                r39 = r38;
                                                            } else {
                                                                str5 = str12;
                                                                r17 = r88;
                                                                r39 = r348;
                                                            }
                                                            break;
                                                        case 2192279:
                                                            ?? r89 = r310;
                                                            ?? r349 = X3;
                                                            r17 = r89;
                                                            r39 = r349;
                                                            if (string.equals("GNCS")) {
                                                                b15 = 38;
                                                                r15 = r89;
                                                                r37 = r349;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 2560667:
                                                            ?? r93 = r310;
                                                            ?? r350 = X3;
                                                            r17 = r93;
                                                            r39 = r350;
                                                            if (string.equals("SYNC")) {
                                                                b15 = 39;
                                                                r15 = r93;
                                                                r37 = r350;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 38786310:
                                                            ?? r94 = r310;
                                                            ?? r351 = X3;
                                                            r17 = r94;
                                                            r39 = r351;
                                                            if (string.equals("HSA_SUPPORT")) {
                                                                b15 = 40;
                                                                r15 = r94;
                                                                r37 = r351;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 69865434:
                                                            ?? r95 = r310;
                                                            ?? r352 = X3;
                                                            r17 = r95;
                                                            r39 = r352;
                                                            if (string.equals("IPASS")) {
                                                                b15 = 41;
                                                                r15 = r95;
                                                                r37 = r352;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 207067495:
                                                            ?? r96 = r310;
                                                            ?? r353 = X3;
                                                            r17 = r96;
                                                            r39 = r353;
                                                            if (string.equals("UNION_PAY_INTERNATIONAL")) {
                                                                b15 = 42;
                                                                r15 = r96;
                                                                r37 = r353;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 275932342:
                                                            ?? r97 = r310;
                                                            ?? r354 = X3;
                                                            r17 = r97;
                                                            r39 = r354;
                                                            if (string.equals("MULTI_LINK_SERVICE")) {
                                                                b15 = 43;
                                                                r15 = r97;
                                                                r37 = r354;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 336043905:
                                                            ?? r98 = r310;
                                                            ?? r355 = X3;
                                                            r17 = r98;
                                                            r39 = r355;
                                                            if (string.equals("SPORT_CARDIO")) {
                                                                b15 = 44;
                                                                r15 = r98;
                                                                r37 = r355;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 394878892:
                                                            ?? r99 = r310;
                                                            ?? r356 = X3;
                                                            String str13 = str6;
                                                            if (string.equals(str13)) {
                                                                b14 = 45;
                                                                str6 = str13;
                                                                r16 = r99;
                                                                r38 = r356;
                                                                b17 = b14;
                                                                r17 = r16;
                                                                r39 = r38;
                                                            } else {
                                                                str6 = str13;
                                                                r17 = r99;
                                                                r39 = r356;
                                                            }
                                                            break;
                                                        case 396293527:
                                                            ?? r100 = r310;
                                                            ?? r357 = X3;
                                                            r17 = r100;
                                                            r39 = r357;
                                                            if (string.equals("EXPLICIT_ARCHIVE")) {
                                                                b15 = 46;
                                                                r15 = r100;
                                                                r37 = r357;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 404706535:
                                                            ?? r101 = r310;
                                                            ?? r358 = X3;
                                                            r17 = r101;
                                                            r39 = r358;
                                                            if (string.equals("EXPLORE_SYNC")) {
                                                                b15 = 47;
                                                                r15 = r101;
                                                                r37 = r358;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 415609929:
                                                            ?? r102 = r310;
                                                            ?? r359 = X3;
                                                            r17 = r102;
                                                            r39 = r359;
                                                            if (string.equals("AUDIO_PROMPT_LAP")) {
                                                                b15 = 48;
                                                                r15 = r102;
                                                                r37 = r359;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 498472970:
                                                            ?? r103 = r310;
                                                            ?? r360 = X3;
                                                            r17 = r103;
                                                            r39 = r360;
                                                            if (string.equals("WORKOUT_DOWNLOAD")) {
                                                                b15 = 49;
                                                                r15 = r103;
                                                                r37 = r360;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 600939521:
                                                            ?? r104 = r310;
                                                            ?? r361 = X3;
                                                            r17 = r104;
                                                            r39 = r361;
                                                            if (string.equals("BASIC_MUSIC_CONTROLS")) {
                                                                b15 = 50;
                                                                r15 = r104;
                                                                r37 = r361;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 604302142:
                                                            ?? r105 = r310;
                                                            ?? r362 = X3;
                                                            r17 = r105;
                                                            r39 = r362;
                                                            if (string.equals("CALENDAR")) {
                                                                b15 = 51;
                                                                r15 = r105;
                                                                r37 = r362;
                                                                b17 = b15;
                                                                r17 = r15;
                                                                r39 = r37;
                                                                break;
                                                            }
                                                            break;
                                                        case 625154250:
                                                            ?? r106 = r310;
                                                            boolean zEquals = string.equals(r106);
                                                            r18 = r106;
                                                            if (zEquals) {
                                                                b14 = 52;
                                                                r38 = X3;
                                                                r16 = r106;
                                                                b17 = b14;
                                                                r17 = r16;
                                                                r39 = r38;
                                                            } else {
                                                                r39 = X3;
                                                                r17 = r18;
                                                            }
                                                            break;
                                                        case 731816808:
                                                            if (string.equals("SPORT_SWIMMING")) {
                                                                b16 = 53;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 740347482:
                                                            if (string.equals("VIVOKID_JR_FIT_LINK")) {
                                                                b16 = 54;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 788388242:
                                                            if (string.equals("DELTA_SOFTWARE_UPDATE_FILES")) {
                                                                b16 = 55;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1043317567:
                                                            if (string.equals("AUDIO_PROMPT_CADENCE")) {
                                                                b16 = 56;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1193334732:
                                                            if (string.equals("SPORT_GENERIC")) {
                                                                b16 = 57;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1199636419:
                                                            if (string.equals("CONTACTS_SUPPORT")) {
                                                                b16 = 58;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1211127643:
                                                            if (string.equals("AUDIO_PROMPTS_SPEECH")) {
                                                                b16 = 59;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1287766918:
                                                            if (string.equals("AUDIO_PROMPT_NAVIGATION")) {
                                                                b16 = 60;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1295554637:
                                                            if (string.equals("CONNECTIQ_WATCH_FACE_DOWNLOAD")) {
                                                                b16 = 61;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1385102027:
                                                            if (string.equals("AUDIO_PROMPT_HEART_RATE")) {
                                                                b16 = 62;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1409306236:
                                                            if (string.equals("SPORT_PROFILE_SETUP")) {
                                                                b16 = 63;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1419596393:
                                                            if (string.equals("WAYPOINT_TRANSFER")) {
                                                                b16 = SignedBytes.MAX_POWER_OF_TWO;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1538739791:
                                                            if (string.equals("GOLF_COURSE_DOWNLOAD")) {
                                                                b16 = 65;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1668118958:
                                                            if (string.equals("CONNECTIQ_APP_MANAGEMENT")) {
                                                                b16 = 66;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1679925456:
                                                            if (string.equals("GARMIN_DEVICE_INFO_FILE_TYPE")) {
                                                                b16 = 67;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1714819033:
                                                            if (string.equals("DELTA_SOFTWARE_UPDATES")) {
                                                                b16 = 68;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1715571904:
                                                            if (string.equals("GPS_EPHEMERIS_DOWNLOAD")) {
                                                                b16 = 69;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1746029975:
                                                            if (string.equals(obj)) {
                                                                b16 = 70;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1838495648:
                                                            if (string.equals("SEGMENTS")) {
                                                                b16 = 71;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1887496371:
                                                            if (string.equals("WIFI_SETUP")) {
                                                                b16 = 72;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 1923606659:
                                                            if (string.equals("CONNECTIQ_WATCH_APP_DOWNLOAD")) {
                                                                b16 = 73;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 2074039031:
                                                            if (string.equals("FITPAY")) {
                                                                b16 = 74;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 2089678645:
                                                            if (string.equals("CONNECTIQ_DATA_FIELD_DOWNLOAD")) {
                                                                b16 = 75;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        case 2137772511:
                                                            if (string.equals("GROUP_LIVETRACK")) {
                                                                b16 = 76;
                                                                b17 = b16;
                                                            }
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                        default:
                                                            r18 = r310;
                                                            r39 = X3;
                                                            r17 = r18;
                                                            break;
                                                    }
                                                    switch (b17) {
                                                        case 0:
                                                            i14 = 60;
                                                            break;
                                                        case 1:
                                                            i14 = 71;
                                                            break;
                                                        case 2:
                                                            i14 = 17;
                                                            break;
                                                        case 3:
                                                            i14 = 4;
                                                            break;
                                                        case 4:
                                                            i14 = 11;
                                                            break;
                                                        case 5:
                                                            i14 = 5;
                                                            break;
                                                        case 6:
                                                            i14 = 33;
                                                            break;
                                                        case 7:
                                                            i14 = 44;
                                                            break;
                                                        case 8:
                                                            i14 = 23;
                                                            break;
                                                        case 9:
                                                            i14 = 73;
                                                            break;
                                                        case 10:
                                                            i14 = 66;
                                                            break;
                                                        case 11:
                                                            i14 = 58;
                                                            break;
                                                        case 12:
                                                            i14 = 1;
                                                            break;
                                                        case 13:
                                                            i14 = 32;
                                                            break;
                                                        case 14:
                                                            i14 = 43;
                                                            break;
                                                        case 15:
                                                            i14 = 68;
                                                            break;
                                                        case 16:
                                                            i14 = 67;
                                                            break;
                                                        case 17:
                                                            i14 = 64;
                                                            break;
                                                        case 18:
                                                            i14 = 26;
                                                            break;
                                                        case 19:
                                                            i14 = 70;
                                                            break;
                                                        case 20:
                                                            i14 = 45;
                                                            break;
                                                        case 21:
                                                            i14 = 10;
                                                            break;
                                                        case 22:
                                                            i14 = 7;
                                                            break;
                                                        case 23:
                                                            i14 = 37;
                                                            break;
                                                        case 24:
                                                            i14 = 27;
                                                            break;
                                                        case 25:
                                                            i14 = 22;
                                                            break;
                                                        case 26:
                                                            i14 = 65;
                                                            break;
                                                        case 27:
                                                            i14 = 46;
                                                            break;
                                                        case 28:
                                                            i14 = 30;
                                                            break;
                                                        case 29:
                                                            i14 = 0;
                                                            break;
                                                        case 30:
                                                            i14 = 62;
                                                            break;
                                                        case 31:
                                                            i14 = 74;
                                                            break;
                                                        case 32:
                                                            i14 = 51;
                                                            break;
                                                        case 33:
                                                            i14 = 8;
                                                            break;
                                                        case 34:
                                                            i14 = 9;
                                                            break;
                                                        case 35:
                                                            i14 = 39;
                                                            break;
                                                        case 36:
                                                            i14 = 13;
                                                            break;
                                                        case 37:
                                                            i14 = 24;
                                                            break;
                                                        case 38:
                                                            i14 = 6;
                                                            break;
                                                        case 39:
                                                            i14 = 3;
                                                            break;
                                                        case 40:
                                                            i14 = 57;
                                                            break;
                                                        case 41:
                                                            i14 = 61;
                                                            break;
                                                        case 42:
                                                            i14 = 63;
                                                            break;
                                                        case 43:
                                                            i14 = 76;
                                                            break;
                                                        case 44:
                                                            i14 = 59;
                                                            break;
                                                        case 45:
                                                            i14 = 34;
                                                            break;
                                                        case 46:
                                                            i14 = 29;
                                                            break;
                                                        case 47:
                                                            i14 = 69;
                                                            break;
                                                        case 48:
                                                            i14 = 36;
                                                            break;
                                                        case 49:
                                                            i14 = 18;
                                                            break;
                                                        case 50:
                                                            i14 = 52;
                                                            break;
                                                        case 51:
                                                            i14 = 49;
                                                            break;
                                                        case 52:
                                                            i14 = 31;
                                                            break;
                                                        case 53:
                                                            i14 = 47;
                                                            break;
                                                        case 54:
                                                            i14 = 2;
                                                            break;
                                                        case 55:
                                                            i14 = 20;
                                                            break;
                                                        case 56:
                                                            i14 = 41;
                                                            break;
                                                        case 57:
                                                            i14 = 42;
                                                            break;
                                                        case 58:
                                                            i14 = 72;
                                                            break;
                                                        case 59:
                                                            i14 = 53;
                                                            break;
                                                        case 60:
                                                            i14 = 40;
                                                            break;
                                                        case 61:
                                                            i14 = 14;
                                                            break;
                                                        case 62:
                                                            i14 = 38;
                                                            break;
                                                        case 63:
                                                            i14 = 56;
                                                            break;
                                                        case 64:
                                                            i14 = 75;
                                                            break;
                                                        case 65:
                                                            i14 = 19;
                                                            break;
                                                        case 66:
                                                            i14 = 16;
                                                            break;
                                                        case 67:
                                                            i14 = 55;
                                                            break;
                                                        case 68:
                                                            i14 = 54;
                                                            break;
                                                        case 69:
                                                            i14 = 28;
                                                            break;
                                                        case 70:
                                                            i14 = 48;
                                                            break;
                                                        case 71:
                                                            i14 = 35;
                                                            break;
                                                        case 72:
                                                            i14 = 50;
                                                            break;
                                                        case 73:
                                                            i14 = 12;
                                                            break;
                                                        case 74:
                                                            i14 = 21;
                                                            break;
                                                        case 75:
                                                            i14 = 15;
                                                            break;
                                                        case 76:
                                                            i14 = 25;
                                                            break;
                                                        default:
                                                            i14 = -1;
                                                            break;
                                                    }
                                                    if (i14 == -1) {
                                                        r14 = r17;
                                                        r310 = r39;
                                                    } else {
                                                        int i27 = i14 / 8;
                                                        int i28 = i14 % 8;
                                                        if (bArrCopyOf.length <= i27) {
                                                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i27 + 1);
                                                        }
                                                        bArrCopyOf[i27] = (byte) (bArrCopyOf[i27] | (1 << i28));
                                                        r14 = r17;
                                                        r310 = r39;
                                                    }
                                                } else {
                                                    r14 = r310;
                                                    r310 = X3;
                                                }
                                                try {
                                                    map7.put(pairCreate, bArrCopyOf);
                                                    columnIndex4 = i26;
                                                    obj = obj;
                                                    X3 = r310;
                                                    r310 = r14;
                                                    j17 = j18;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r35 = r310;
                                                    Throwable th4 = th;
                                                    if (r35 == 0) {
                                                        throw th4;
                                                    }
                                                    try {
                                                        r35.close();
                                                        throw th4;
                                                    } catch (Throwable th5) {
                                                        th4.addSuppressed(th5);
                                                        throw th4;
                                                    }
                                                }
                                            }
                                        }
                                        int i29 = columnIndex4;
                                        Object obj12 = obj;
                                        ?? r107 = r310;
                                        r36 = X3;
                                        if (r36.moveToNext()) {
                                            columnIndex4 = i29;
                                            obj = obj12;
                                            X3 = r36;
                                            r310 = r107;
                                            map3 = map8;
                                        }
                                    }
                                } else {
                                    r36 = X3;
                                }
                                r36.close();
                                for (Map.Entry entry2 : map7.entrySet()) {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("unit_id", (Long) ((Pair) entry2.getKey()).first);
                                    contentValues.put("mac_address", (String) ((Pair) entry2.getKey()).second);
                                    contentValues.put("capabilities", (byte[]) entry2.getValue());
                                    cVar.v3(contentValues);
                                    map2.remove(((Pair) entry2.getKey()).first);
                                }
                                cVar.k3("DROP TABLE device_supported_capabilities");
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                r35 = X3;
                            }
                        } catch (Throwable th7) {
                            if (cursorX3 == null) {
                                throw th7;
                            }
                            try {
                                cursorX3.close();
                                throw th7;
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                                throw th7;
                            }
                        }
                    }
                }
            } catch (Throwable th9) {
                if (sQLiteDatabaseOpenDatabase == null) {
                    throw th9;
                }
                try {
                    sQLiteDatabaseOpenDatabase.close();
                    throw th9;
                } catch (Throwable th10) {
                    th9.addSuppressed(th10);
                    throw th9;
                }
            }
        }
    }

    public static class d extends kd.a {
        public d() {
            super(4, 5);
        }

        @Override // kd.a
        public final void migrate(vd.c cVar) {
            cVar.k3("DROP TABLE IF EXISTS device_supported_capabilities");
            cVar.k3("CREATE TABLE IF NOT EXISTS device_capabilities (`unit_id` INTEGER NOT NULL, `mac_address` TEXT NOT NULL, `capabilities` BLOB NOT NULL, PRIMARY KEY(`unit_id`, `mac_address`))");
        }
    }

    public static ConnectDatabase g() {
        ConnectDatabase connectDatabase = f50136b;
        if (connectDatabase != null) {
            return connectDatabase;
        }
        f.n("com.garmin.android.library.connectdatabase.ConnectDatabase.getInstance() not possible without first calling 'init(Context context)'.");
        return null;
    }

    public static void init(Context context) {
        ConnectDatabase connectDatabase = f50136b;
        Logger logger = f50135a;
        if (connectDatabase != null) {
            logger.warn("already initialized, why are you calling 'init()' again");
            return;
        }
        b0.a aVarA = x.a(context.getApplicationContext(), ConnectDatabase.class, "connect");
        aVarA.a(new a(), new b(), new c(context), new d());
        f50136b = (ConnectDatabase) aVarA.b();
        logger.debug("initialized");
    }

    public abstract rd2.b e();

    public abstract rd2.d f();
}
