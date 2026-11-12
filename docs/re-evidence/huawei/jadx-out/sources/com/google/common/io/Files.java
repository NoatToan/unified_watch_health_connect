package com.google.common.io;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.graph.SuccessorsFunction;
import defpackage.aml;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class Files {
    private static final SuccessorsFunction<File> d = new SuccessorsFunction<File>() { // from class: com.google.common.io.Files.5
        @Override // com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Iterable<File> successors(File file) {
            File[] fileArrListFiles;
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                return Collections.unmodifiableList(Arrays.asList(fileArrListFiles));
            }
            return ImmutableList.of();
        }
    };

    /* JADX INFO: renamed from: com.google.common.io.Files$3, reason: invalid class name */
    class AnonymousClass3 implements LineProcessor<List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<String> f4614a = aml.e();

        AnonymousClass3() {
        }

        @Override // com.google.common.io.LineProcessor
        public boolean processLine(String str) {
            this.f4614a.add(str);
            return true;
        }

        @Override // com.google.common.io.LineProcessor
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> getResult() {
            return this.f4614a;
        }
    }

    enum FilePredicate implements Predicate<File> {
        IS_DIRECTORY { // from class: com.google.common.io.Files.FilePredicate.1
            @Override // com.google.common.base.Predicate
            public boolean apply(File file) {
                return file.isDirectory();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }
        },
        IS_FILE { // from class: com.google.common.io.Files.FilePredicate.2
            @Override // com.google.common.base.Predicate
            public boolean apply(File file) {
                return file.isFile();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }
        };

        /* synthetic */ FilePredicate(AnonymousClass3 anonymousClass3) {
            this();
        }
    }
}
