package org.junit.experimental.categories;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.runner.manipulation.Filter;

/* JADX INFO: loaded from: classes23.dex */
public final class ExcludeCategories extends org.junit.experimental.categories.a {

    public static class a extends Categories.CategoryFilter {
        public a(List<Class<?>> list) {
            this(new HashSet(list));
        }

        @Override // org.junit.experimental.categories.Categories.CategoryFilter, org.junit.runner.manipulation.Filter
        public String describe() {
            return "excludes " + super.describe();
        }

        public a(Set<Class<?>> set) {
            super(true, null, true, set);
        }
    }

    @Override // org.junit.experimental.categories.a
    public Filter createFilter(List<Class<?>> list) {
        return new a(list);
    }
}
