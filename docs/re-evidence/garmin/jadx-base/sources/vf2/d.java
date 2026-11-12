package vf2;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvf2/d;", "", "Lvf2/b;", "category", "", "Lvf2/f;", "exercises", "<init>", "(Lvf2/b;Ljava/util/List;)V", "a", "Lvf2/b;", "()Lvf2/b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("category")
    private final b category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exercises")
    private final List<f> exercises;

    public d(b bVar, List<f> list) {
        bVar.getClass();
        list.getClass();
        this.category = bVar;
        this.exercises = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getCategory() {
        return this.category;
    }

    public final List<f> b() {
        return this.exercises;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.category, dVar.category) && p005kotlin.jvm.internal.s.g(this.exercises, dVar.exercises);
    }

    public final int hashCode() {
        return this.exercises.hashCode() + (this.category.hashCode() * 31);
    }

    public final String toString() {
        return "ExerciseFitMap(category=" + this.category + ", exercises=" + this.exercises + ")";
    }
}
