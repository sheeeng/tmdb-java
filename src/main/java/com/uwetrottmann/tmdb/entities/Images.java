
package com.uwetrottmann.tmdb.entities;

import com.uwetrottmann.tmdb.Entity;

public class Images implements Entity {
    private static final long serialVersionUID = -4374523954772900340L;

    public String poster;
    public String fanart;
    public String headshot;
    public String screen;

    /** @deprecated Use {@link #poster} */
    @Deprecated
    public String getPoster() {
        return this.poster;
    }

    /** @deprecated Use {@link #fanart} */
    @Deprecated
    public String getFanart() {
        return this.fanart;
    }

    /** @deprecated Use {@link #headshot} */
    @Deprecated
    public String getHeadshot() {
        return this.headshot;
    }

    /** @deprecated Use {@link #screen} */
    @Deprecated
    public String getScreen() {
        return this.screen;
    }
}