package be.insaneprogramming.geojson;

import java.util.Collection;
import java.util.List;

public class MultiPolygon extends GeoJsonObject<List<List<Point>>> {
    @Override
    public String getType() {
        return "MultiPolygon";
    }

    public MultiPolygon() {
    }

    public MultiPolygon(Collection<? extends List<List<Point>>> c) {
        super(c);
    }

    MultiPolygon(Object object) {
        super(object);
    }
}