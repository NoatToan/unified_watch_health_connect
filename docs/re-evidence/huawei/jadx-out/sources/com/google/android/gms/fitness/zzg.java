package com.google.android.gms.fitness;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzg {
    public static Set<Scope> zza(Collection<Scope> collection) {
        Scope scope;
        HashSet hashSet = new HashSet(collection.size());
        for (Scope scope2 : collection) {
            if (scope2.equals(new Scope(Scopes.FITNESS_ACTIVITY_READ))) {
                scope = new Scope(Scopes.FITNESS_ACTIVITY_READ_WRITE);
            } else if (scope2.equals(new Scope(Scopes.FITNESS_LOCATION_READ))) {
                scope = new Scope(Scopes.FITNESS_LOCATION_READ_WRITE);
            } else if (scope2.equals(new Scope(Scopes.FITNESS_BODY_READ))) {
                scope = new Scope(Scopes.FITNESS_BODY_READ_WRITE);
            } else if (scope2.equals(new Scope(Scopes.FITNESS_NUTRITION_READ))) {
                scope = new Scope(Scopes.FITNESS_NUTRITION_READ_WRITE);
            } else if (scope2.equals(new Scope(Scopes.FITNESS_BLOOD_PRESSURE_READ))) {
                scope = new Scope(Scopes.FITNESS_BLOOD_PRESSURE_READ_WRITE);
            } else if (scope2.equals(new Scope(Scopes.FITNESS_BLOOD_GLUCOSE_READ))) {
                scope = new Scope(Scopes.FITNESS_BLOOD_GLUCOSE_READ_WRITE);
            } else if (scope2.equals(new Scope(Scopes.FITNESS_OXYGEN_SATURATION_READ))) {
                scope = new Scope(Scopes.FITNESS_OXYGEN_SATURATION_READ_WRITE);
            } else if (scope2.equals(new Scope(Scopes.FITNESS_BODY_TEMPERATURE_READ))) {
                scope = new Scope(Scopes.FITNESS_BODY_TEMPERATURE_READ_WRITE);
            } else {
                scope = scope2.equals(new Scope(Scopes.FITNESS_REPRODUCTIVE_HEALTH_READ)) ? new Scope(Scopes.FITNESS_REPRODUCTIVE_HEALTH_READ_WRITE) : scope2;
            }
            if (scope.equals(scope2) || !collection.contains(scope)) {
                hashSet.add(scope2);
            }
        }
        return hashSet;
    }
}
