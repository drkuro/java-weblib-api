-- Insertion des données dans la table "livres"
INSERT INTO livres (ID, Titre, AnneePublication, IDAuteur)
VALUES
  (1, 'L''Étranger', 1942, 1),
  (2, '1984', 1949, 2),
  (3, 'Le Seigneur des Anneaux', 1954, 3),
  (4, 'Orgueil et Préjugés', 1813, 4),
  (5, 'Fahrenheit 451', 1953, 5),
  (6, 'Le Petit Prince', 1943, 6),
  (7, 'Les Misérables', 1862, 7),
  (8, 'Le Comte de Monte-Cristo', 1844, 8),
  (9, 'Crime et Châtiment', 1866, 9),
  (10, 'Le Nom de la Rose', 1980, 10),
  (11, 'Ne tirez pas sur l''oiseau moqueur', 1960, 11),
  (12, 'Les Raisins de la colère', 1939, 12),
  (13, 'Les Trois Mousquetaires', 1844, 8),
  (14, 'Les Fleurs du Mal', 1857, 13),
  (15, 'Le Parfum', 1985, 14),
  (16, 'Cent ans de solitude', 1967, 15),
  (17, 'Anna Karénine', 1877, 16),
  (18, 'Les Aventures de Tom Sawyer', 1876, 17),
  (19, 'Au Bonheur des Dames', 1883, 18),
  (20, 'Le Vieil Homme et la Mer', 1952, 19);

-- Insertion des données dans la table "auteurs"
INSERT INTO auteurs (ID, Nom, Nationalite)
VALUES
  (5, 'Ray Bradbury', 'Américaine'),
  (6, 'Antoine de Saint-Exupéry', 'Française'),
  (7, 'Victor Hugo', 'Française'),
  (8, 'Alexandre Dumas', 'Française'),
  (9, 'Fyodor Dostoevsky', 'Russe'),
  (10, 'Umberto Eco', 'Italien'),
  (11, 'Harper Lee', 'Américaine'),
  (12, 'John Steinbeck', 'Américaine'),
  (13, 'Charles Baudelaire', 'Française'),
  (14, 'Patrick Süskind', 'Allemande'),
  (15, 'Gabriel García Márquez', 'Colombienne'),
  (16, 'Leo Tolstoy', 'Russe'),
  (17, 'Mark Twain', 'Américaine'),
  (18, 'Émile Zola', 'Française');
