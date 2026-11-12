package com.airbnb.lottie.model.content;

import defpackage.fi4;
import defpackage.hh4;
import defpackage.jte;
import defpackage.lse;
import defpackage.qqf;
import defpackage.rpe;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class MergePaths implements fi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MergePathsMode f5679b;
    public final boolean c;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i != 4) {
                return i != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f5678a = str;
        this.f5679b = mergePathsMode;
        this.c = z;
    }

    @Override // defpackage.fi4
    public hh4 a(jte jteVar, lse lseVar, com.airbnb.lottie.model.layer.a aVar) {
        if (jteVar.A()) {
            return new qqf(this);
        }
        rpe.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public MergePathsMode b() {
        return this.f5679b;
    }

    public String c() {
        return this.f5678a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f5679b + AbstractJsonLexerKt.END_OBJ;
    }
}
